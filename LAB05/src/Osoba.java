public class Osoba {


    private String imie,nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba() {
        this.imie = "nieznany";
        this.nazwisko = "nieznany";
        this.wiek = 0;
    }

    public void pokazDane(){
        System.out.println("Imię: " + imie + "\nNazwisko: " + nazwisko + " Wiek: " + wiek);
    }
}
