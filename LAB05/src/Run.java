import java.util.Scanner;

public class Run {

    Scanner scanner = new Scanner(System.in);
    protected void Task01() {
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 22);
        osoba1.pokazDane();

        Osoba osoba2 = new Osoba("Damian", 21);
        osoba2.pokazDane();

        Osoba osoba3 = new Osoba();
        osoba3.pokazDane();
    }

    protected void Task02() {
        Student student1 = new Student(new Osoba("Jan", "Kowalski", 25), "Informatyka", 123123, 2);
        student1.pokazDane();

        Student student2 = new Student(new Osoba("Michal", "Nowak", 26), 12354);
        student2.pokazDane();

        Student student3 = new Student(new Osoba("Jan", "Kowalski", 25));
        student3.pokazDane();

        Student student4 = new Student(new Osoba("Michal", 23));
        student4.pokazDane();
    }

    protected void Task03(){
        System.out.println("Podaj imie studenta: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko studenta: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek studenta: ");
        int wiek = scanner.nextInt();
        System.out.println("Podaj numer indeksu studenta: ");
        int nr_indeksu = scanner.nextInt();
        System.out.println("Podaj specjalnosc studenta: ");
        String specjalnosc = scanner.nextLine();
        System.out.println("Podaj rok studenta: ");
        int rok = scanner.nextInt();

            Student nowyStudent = new Student(new Osoba(imie,nazwisko,wiek), specjalnosc,nr_indeksu,rok);
            nowyStudent.pokazDane();
    }
}
