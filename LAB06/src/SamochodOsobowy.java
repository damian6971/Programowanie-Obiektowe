public class SamochodOsobowy extends Samochod{
    public float waga,pojemnosc_silnika,ilosc_osob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg, float waga, float pojemnosc_silnika, float ilosc_osob) {
        super(marka, model, nadwozie, kolor, rok_produkcji, przebieg);
        setWaga(waga);
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.ilosc_osob = ilosc_osob;
    }

    public SamochodOsobowy(){
        super();
    }

    @Override
    public void setPrzebieg(int przebieg) {
        super.setPrzebieg(przebieg);
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("Waga: " + waga + " t");
        System.out.println("Pojemnosc silnika: " + pojemnosc_silnika + " l");
        System.out.println("Ilosc osob: " + ilosc_osob);
    }

    public void setWaga(float waga){
        if(waga >=2 && waga <=4.5){
            this.waga = waga;
        }else{
            System.out.println("Podales nieprawidłową wagę ! Poprawny przedział - [2-4.5]");

        }
    }

    public void setPojemnosc_silnika(int pojemnosc_silnika){
        if(pojemnosc_silnika>=0.8 && pojemnosc_silnika <=3.0){
            this.pojemnosc_silnika=pojemnosc_silnika;
        }else{
            System.out.println("Podales nieprawidłową pojemność silnika ! Poprawny przedział - [0.8-3.0]");
        }
    }
}
