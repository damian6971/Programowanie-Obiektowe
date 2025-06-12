import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz zadanie:");
        System.out.println("1 – Unikalne imiona");
        System.out.println("2 – Imiona par");
        System.out.println("3 – Lista uczestników");
        System.out.println("4 – Tablica -> Lista -> subList()");
        System.out.println("5 – Odwracanie listy");
        System.out.print("Twój wybór: ");

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
                Zadanie4.main(args);
                break;
            case "5":
                Zadanie5.main(args);
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }
    }
}