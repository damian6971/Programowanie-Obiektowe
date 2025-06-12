import java.util.Scanner;

public class AdresTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj ulicę: ");
            String ulica = scanner.nextLine();

            System.out.print("Podaj numer domu: ");
            int numerDomu = Integer.parseInt(scanner.nextLine());

            System.out.print("Podaj kod pocztowy: ");
            String kod = scanner.nextLine();

            System.out.print("Podaj miasto: ");
            String miasto = scanner.nextLine();

            Adres adres = new Adres(ulica, numerDomu, kod, miasto);
            System.out.println("Adres poprawny: " + adres);

        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd walidacji: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Numer domu musi być liczbą.");
        }
    }
}