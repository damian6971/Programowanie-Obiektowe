public class Ksiazka {
    protected String tytul,autor;
    protected double cena;

    public Ksiazka(String tytul, String autor, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }

    public void opis(){
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: "+ autor);
        System.out.println("Cena: " + cena +"zł");
    }
}
