import java.util.Scanner;

public class Samochod {
    public   String Marka,Model,Nadwozie,Kolor;
    public int rok_produkcji, przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg) {

        Marka = marka;
        Model = model;
        Nadwozie = nadwozie;
        Kolor = kolor;
        this.rok_produkcji = rok_produkcji;
        setPrzebieg(przebieg);
    }

    public Samochod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj marke samochodu: ");
        this.Marka = scanner.nextLine();
        System.out.println("Podaj model samochodu: ");
        this.Model=scanner.nextLine();
        System.out.println("Podaj typ nadwozia: ");
        this.Nadwozie = scanner.nextLine();
        System.out.println("Podaj kolor samochodu: ");
        this.Kolor=scanner.nextLine();
        System.out.println("Podaj rok produkcji samochodu: ");
        this.rok_produkcji= scanner.nextInt();
        System.out.println("Podaj przebieg samochodu: ");
        this.przebieg= scanner.nextInt();



    }

    public void opis(){
        System.out.println("\n\nSamochod:" +"\nMarka: "+ this.Marka +"\nModel: "+ this.Model + "\nNadwozie: "
                + this.Nadwozie + "\nKolor: " + this.Kolor + "\nRok produkcji: " + this.rok_produkcji +
                "\nPrzebieg: " + this.przebieg + "km");
    }
    public void setPrzebieg(int przebieg){
        if(przebieg >=0){
            this.przebieg=przebieg;
        }else{
            System.out.printf("Przebieg nie może być ujemny!");
            this.przebieg =0;
        }
    }
}
