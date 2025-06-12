import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Symulacja świateł drogowych (enum Swiatlo)");
            System.out.println("2 - Informacje o rozmiarach pizzy (enum PizzaSize)");
            System.out.println("0 - Wyjście");
            System.out.print("Wybierz opcję: ");

            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    Zadanie1.main(args);
                    break;
                case "2":
                    Zadanie2.main(args);
                    break;
                case "0":
                    System.out.println("Zakończono.");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór.");
            }
        }
    }
}