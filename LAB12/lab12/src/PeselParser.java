import java.time.LocalDate;

public class PeselParser {
    public static LocalDate getDataUrodzenia(String pesel) {
        int rok = Integer.parseInt(pesel.substring(0, 2));
        int miesiac = Integer.parseInt(pesel.substring(2, 4));
        int dzien = Integer.parseInt(pesel.substring(4, 6));

        int stulecie = 1900;
        if (miesiac >= 1 && miesiac <= 12) stulecie = 1900;
        else if (miesiac >= 21 && miesiac <= 32) {
            stulecie = 2000;
            miesiac -= 20;
        } else if (miesiac >= 41 && miesiac <= 52) {
            stulecie = 2100;
            miesiac -= 40;
        } else if (miesiac >= 61 && miesiac <= 72) {
            stulecie = 2200;
            miesiac -= 60;
        } else if (miesiac >= 81 && miesiac <= 92) {
            stulecie = 1800;
            miesiac -= 80;
        }

        rok += stulecie;

        return LocalDate.of(rok, miesiac, dzien);
    }

    public static boolean czyKobieta(String pesel) {
        int cyfraPlec = Character.getNumericValue(pesel.charAt(9));
        return cyfraPlec % 2 == 0;
    }
}