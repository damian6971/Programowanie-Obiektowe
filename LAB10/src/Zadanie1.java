import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        // Usunięcie interpunkcji, małe litery
        tekst = tekst.replaceAll("[\\p{Punct}]", "").toLowerCase();

        String[] slowa = tekst.split("\\s+");
        Map<String, Integer> wystapienia = new HashMap<>();

        for (String slowo : slowa) {
            wystapienia.put(slowo, wystapienia.getOrDefault(slowo, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wystapienia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}