import java.util.ArrayList;

public class Ksiegarnia {
    protected String nazwa;
    protected ArrayList<Ksiazka> ksiazki;
    protected ArrayList<Klient> klient;

    public Ksiegarnia(String nazwa) {
        this.nazwa = nazwa;
        this.ksiazki = new ArrayList<>();
        this.klient = new ArrayList<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        ksiazki.add(ksiazka);
    }

    public void dodajKlienta(Klient klientc){
        klient.add(klientc);
    }

    public void opisKsiegarnia(){
        System.out.println("Nazwa "+nazwa);

        System.out.println("Lista ksiazek");
        for(Ksiazka ksiazka : ksiazki){
            ksiazka.opis();
            System.out.println();
        }
        System.out.println("Lista klientow");
        for(Klient klient : klient){
            klient.opisKlienta();
            System.out.println();
        }
    }




}
