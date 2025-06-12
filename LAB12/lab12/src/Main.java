import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<PeselInfo> lista = new ArrayList<>();

        try {
            List<String> linie = Files.readAllLines(Paths.get("pesel.txt"));

            for (String linia : linie) {
                linia = linia.trim();
                if (linia.matches("\\d{11}")) {
                    lista.add(new PeselInfo(linia));
                }
            }

            long kobiety = lista.stream().filter(PeselInfo::isKobieta).count();
            long mezczyzni = lista.size() - kobiety;

            System.out.println("Kobiety: " + kobiety);
            System.out.println("Mężczyźni: " + mezczyzni);

            wypiszZakres(lista, 1950, 1980);
            wypiszZakres(lista, 1981, 2000);
            wypiszZakres(lista, 2001, 2025);

            List<String> datyUrodzenia = lista.stream()
                    .map(PeselInfo::getDataUrodzeniaFormatted)
                    .collect(Collectors.toList());

            Files.write(Paths.get("wyniki.txt"), datyUrodzenia);
            System.out.println("Zapisano do wyniki.txt");

        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }
    }

    private static void wypiszZakres(List<PeselInfo> lista, int od, int doRoku) {
        List<PeselInfo> osoby = lista.stream()
                .filter(p -> {
                    int rok = p.getDataUrodzenia().getYear();
                    return rok >= od && rok <= doRoku;
                })
                .collect(Collectors.toList());

        double srednia = osoby.stream()
                .mapToInt(PeselInfo::getWiek)
                .average()
                .orElse(0.0);

        System.out.println("Liczba osób urodzonych " + od + "-" + doRoku + ": " + osoby.size());
        System.out.printf("Średni wiek: %.2f lat\n", srednia);
    }
}