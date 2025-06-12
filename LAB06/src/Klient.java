public class Klient {
    public String imie,nazwisko;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void opisKlienta(){
        System.out.println("Imie: "+ imie);
        System.out.println("Nazwisko: "+ nazwisko);
    }
}
