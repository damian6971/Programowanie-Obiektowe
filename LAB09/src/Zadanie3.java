import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Uczestnik> uczestnicyArray = new ArrayList<>();
        List<Uczestnik> uczestnicyLinked = new LinkedList<>();

        uczestnicyArray.add(new Uczestnik(1, "Anna", 22));
        uczestnicyArray.add(new Uczestnik(2, "Jan", 16));
        uczestnicyArray.add(new Uczestnik(3, "Ola", 18));

        uczestnicyLinked.addAll(uczestnicyArray);

        System.out.println("Pełna lista:");
        uczestnicyArray.forEach(System.out::println);

        System.out.println("\nPełnoletni:");
        uczestnicyArray.stream()
                .filter(u -> u.getWiek() >= 18)
                .forEach(System.out::println);
    }
}