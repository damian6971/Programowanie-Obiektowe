import java.time.LocalDate;
import java.time.Period;

public class PeselInfo {
    private String pesel;
    private LocalDate dataUrodzenia;
    private boolean kobieta;

    public PeselInfo(String pesel) {
        this.pesel = pesel;
        this.dataUrodzenia = PeselParser.getDataUrodzenia(pesel);
        this.kobieta = PeselParser.czyKobieta(pesel);
    }

    public boolean isKobieta() {
        return kobieta;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int getWiek() {
        return Period.between(dataUrodzenia, LocalDate.now()).getYears();
    }

    public String getPesel() {
        return pesel;
    }

    public String getDataUrodzeniaFormatted() {
        return String.format("%04d-%02d-%02d",
                dataUrodzenia.getYear(),
                dataUrodzenia.getMonthValue(),
                dataUrodzenia.getDayOfMonth());
    }
}