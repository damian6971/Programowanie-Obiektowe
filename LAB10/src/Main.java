import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Zliczanie słów (Zadanie 1)");
            System.out.println("2 - Logowanie użytkowników (Zadanie 2)");
            System.out.println("3 - Karta dań (Zadanie 3)");
            System.out.println("4 - Wyjście");
            System.out.print("Wybierz zadanie: ");

            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    Zadanie1.main(args);
                    break;
                case "2":
                    Zadanie2.main(args);
                    break;
                case "3":
                    Zadanie3.main(args);
                    break;
                case "4":
                    System.out.println("Zakończono.");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór.");
            }
        }
    }
}