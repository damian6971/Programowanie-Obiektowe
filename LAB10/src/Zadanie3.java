import java.util.*;

public class Zadanie3 {
    private static final Map<String, Double> menu = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1 - Dodaj danie");
            System.out.println("2 - Wyświetl menu");
            System.out.println("3 - Usuń danie");
            System.out.println("4 - Oblicz rachunek");
            System.out.println("5 - Wyjście");
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    dodajDanie();
                    break;
                case "2":
                    wyswietlMenu();
                    break;
                case "3":
                    usunDanie();
                    break;
                case "4":
                    obliczRachunek();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nieznana opcja.");
            }
        }
    }

    private static void dodajDanie() {
        System.out.print("Nazwa dania: ");
        String nazwa = scanner.nextLine();
        System.out.print("Cena: ");
        double cena = Double.parseDouble(scanner.nextLine());
        menu.put(nazwa, cena);
        System.out.println("Dodano: " + nazwa + " – " + String.format("%.2f", cena) + " zł");
    }

    private static void wyswietlMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu jest puste.");
            return;
        }
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " – " + String.format("%.2f", entry.getValue()) + " zł");
        }
    }

    private static void usunDanie() {
        System.out.print("Podaj nazwę dania do usunięcia: ");
        String nazwa = scanner.nextLine();
        if (menu.remove(nazwa) != null) {
            System.out.println("Usunięto danie: " + nazwa);
        } else {
            System.out.println("Nie znaleziono takiego dania.");
        }
    }

    private static void obliczRachunek() {
        System.out.print("Podaj nazwy dań oddzielone przecinkiem: ");
        String[] dania = scanner.nextLine().split(",");
        double suma = 0.0;

        for (String danie : dania) {
            String klucz = danie.trim();
            if (menu.containsKey(klucz)) {
                suma += menu.get(klucz);
            } else {
                System.out.println("Brak dania: " + klucz);
            }
        }

        System.out.println("Rachunek: " + String.format("%.2f", suma) + " zł");
    }
}