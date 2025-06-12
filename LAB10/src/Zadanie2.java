import java.util.*;

public class Zadanie2 {
    private static final Map<String, String> uzytkownicy = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1 - Dodaj użytkownika");
            System.out.println("2 - Zaloguj się");
            System.out.println("3 - Wyjście");
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    dodajUzytkownika();
                    break;
                case "2":
                    logowanie();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Nieznana opcja.");
            }
        }
    }

    private static void dodajUzytkownika() {
        System.out.print("Podaj login: ");
        String login = scanner.nextLine();
        System.out.print("Podaj hasło: ");
        String haslo = scanner.nextLine();
        uzytkownicy.put(login, haslo);
        System.out.println("Użytkownik dodany.");
    }

    private static void logowanie() {
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Hasło: ");
        String haslo = scanner.nextLine();

        if (uzytkownicy.containsKey(login) && uzytkownicy.get(login).equals(haslo)) {
            System.out.println("Zalogowano pomyślnie!");
        } else {
            System.out.println("Błędny login lub hasło.");
        }
    }
}