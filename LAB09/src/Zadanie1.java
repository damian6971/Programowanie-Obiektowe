import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> imiona = new HashSet<>();

        while (true) {
            System.out.print("Podaj imię (\"-\" aby zakończyć): ");
            String imie = scanner.nextLine();
            if (imie.equals("-")) break;
            imiona.add(imie);
        }

        System.out.println("Liczba unikalnych imion: " + imiona.size());
    }
}