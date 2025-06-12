import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz rozmiar pizzy (MALA, SREDNIA, DUZA):");
        String wybor = scanner.nextLine().toUpperCase();

        try {
            PizzaSize size = PizzaSize.valueOf(wybor);
            System.out.println("Średnica: " + size.getSrednica() + " cm");
            System.out.println("Cena: " + size.getCena() + " zł");
        } catch (IllegalArgumentException e) {
            System.out.println("Nieprawidłowy rozmiar pizzy.");
        }
    }
}