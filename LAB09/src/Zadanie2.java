import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> pary = new HashMap<>();

        while (true) {
            System.out.print("Podaj imię pierwszej osoby (\"-\" aby zakończyć): ");
            String p1 = scanner.nextLine();
            if (p1.equals("-")) break;

            System.out.print("Podaj imię partnera/partnerki: ");
            String p2 = scanner.nextLine();

            pary.put(p1, p2);
        }

        System.out.print("Podaj imię, aby znaleźć partnera: ");
        String szukane = scanner.nextLine();

        if (pary.containsKey(szukane)) {
            System.out.println("Partner(ka): " + pary.get(szukane));
        } else {
            System.out.println("Brak takiego imienia.");
        }
    }
}