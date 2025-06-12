import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kolor światła (CZERWONE, ZOLTE, ZIELONE):");
        String input = scanner.nextLine().toUpperCase();

        try {
            Swiatlo swiatlo = Swiatlo.valueOf(input);
            System.out.println(swiatlo.getKomunikat());
        } catch (IllegalArgumentException e) {
            System.out.println("Nieznane światło.");
        }
    }
}