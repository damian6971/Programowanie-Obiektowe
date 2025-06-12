public class Samochody extends Pojazd {
    private double cenaZaGodzine;

    public Samochody(boolean czyDostepny, String model, String id, double cenaZaGodzine) {
        super(czyDostepny, model, id);
        this.cenaZaGodzine = cenaZaGodzine;
    }

    @Override
    public double obliczKoszt(int IloscGodzin) {
        return 0;
    }
}
