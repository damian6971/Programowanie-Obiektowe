import java.util.*;

public class Zadanie5 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = new ArrayList<>();

        ListIterator<Integer> it = lista1.listIterator(lista1.size());

        while (it.hasPrevious()) {
            lista2.add(it.previous());
        }

        System.out.println("Oryginalna lista: " + lista1);
        System.out.println("Odwrotna lista: " + lista2);
    }
}