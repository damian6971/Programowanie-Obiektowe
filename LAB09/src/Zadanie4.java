import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {
        Produkt[] produkty = {
                new Produkt("Młotek"),
                new Produkt("Wiertarka"),
                new Produkt("Piła"),
                new Produkt("Miara"),
                new Produkt("Śrubokręt")
        };

        List<Produkt> lista = new ArrayList<>(Arrays.asList(produkty));

        System.out.println("Cała lista:");
        lista.forEach(System.out::println);

        List<Produkt> podlista = lista.subList(1, 4); // Wiertarka, Piła, Miara
        podlista.clear(); // Usunięcie fragmentu z oryginalnej listy

        System.out.println("\nPo usunięciu podlisty:");
        lista.forEach(System.out::println);
    }
}