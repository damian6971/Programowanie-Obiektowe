import java.util.ArrayList;

public abstract class Pojazd {
    protected ArrayList<Pojazd> dostepnePojazdy;

    protected boolean czyDostepny;
    protected String model;
    protected String id;

    public Pojazd(boolean czyDostepny, String model, String id) {
        this.dostepnePojazdy = new ArrayList<>();
        this.czyDostepny = czyDostepny;
        this.model = model;
        this.id = id;
    }

    public boolean isCzyDostepny() {
        return czyDostepny;

    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public void wypozycz() {
        this.czyDostepny = false;
    }

    public void zwroc() {
        this.czyDostepny = true;
    }

    public abstract double obliczKoszt(int IloscGodzin);
}
