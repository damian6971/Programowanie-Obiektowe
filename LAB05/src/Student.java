public class Student {
    private String nazwa_specjalnosci;
    private int nr_indeksu,rok_studiow;
    private Osoba osoba;

    public Student(Osoba osoba,String nazwa_specjalnosci, int nr_indeksu, int rok_studiow) {
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.nr_indeksu = nr_indeksu;
        this.rok_studiow = rok_studiow;
        this.osoba = osoba;
    }

    public Student(Osoba osoba,String nazwa_specjalnosci, int nr_indeksu) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = 1;
    }

    public Student(Osoba osoba,int nr_indeksu) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = "Brak danych";
        this.rok_studiow = 1;
    }

    public Student(Osoba osoba) {
        this.osoba = osoba;
        this.nr_indeksu = 0;
        this.nazwa_specjalnosci = "Brak danych";
        this.rok_studiow = 0;
    }

    public void pokazDane(){
        osoba.pokazDane();
        System.out.println("Nr indeksu: "+  (nr_indeksu != 0 ? nr_indeksu : "brak danych"));
        System.out.println("Specjalnosc: "+ (nazwa_specjalnosci != "Brak danych" ? nazwa_specjalnosci : "brak danych"));
        System.out.println("Rok studiow: "+ rok_studiow);
        System.out.println("---- ");

    }
}
