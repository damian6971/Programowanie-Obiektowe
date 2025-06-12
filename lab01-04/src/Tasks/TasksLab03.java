package Tasks;

import java.util.Random;

public class TasksLab03 {
    InputData inputData = new InputData();


    protected void Task01(){
        System.out.printf("Podaj liczbę studentów: ");
        int n = inputData.InputInt();
        int i =1;
        int srednia=0;
        while(i <= n){
            System.out.printf("Wprowadz liczbe punktow dla studenta " + i + ": ");
            srednia += inputData.InputInt();

            i++;
        }
        System.out.printf("Srednia: " + srednia);
    }

    protected void Task02(){

        System.out.printf("Podaj 10 liczb do sprawdzenia: \n");
        int i =1;
        int sumaLiczbDodatnich=0;
        int sumaLiczbUjemnych=0;
        int iloscLiczbDodatnich=0;
        int iloscLiczbUjemnych=0;
        while(i<=10){
            System.out.printf("Podaj liczbę " + i + ": ");
            int liczba = inputData.InputInt();
            if(liczba>0)
            {
                sumaLiczbDodatnich += liczba;
                iloscLiczbDodatnich++;
            }else if(liczba<0){
                sumaLiczbUjemnych += liczba;
                iloscLiczbUjemnych++;
            }
            i++;
        }
        System.out.println("suma dodatnich: " + sumaLiczbDodatnich);
        System.out.println("suma ujemnych: " + sumaLiczbUjemnych);
        System.out.println("Liczba liczb dodatnich " + iloscLiczbDodatnich);
        System.out.println("Liczba liczb ujemnych " + iloscLiczbUjemnych);
    }

    protected void Task03(){
        int i=1;
        int sumaLiczb=0;

        System.out.printf("Podaj 10 liczb");
        while(i<=10){
            System.out.println("Podaj liczbę " + i + ": ");
            int liczba = inputData.InputInt();
            if(liczba>0 && liczba % 2 ==0){
                sumaLiczb +=liczba;
            }else if(liczba < 0){
                System.out.printf("Podałeś złą liczbę!");
                break;
            }
            i++;

        }
        System.out.printf("Suma liczb wynosi: " + sumaLiczb);
    }


//    Wykorzystując algorytm z zadania 5, napisz program który pozwoli użytkownikowi na
//    wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb parzystych w danym
//    ciągu.
    protected void Task04(){
        Random rand = new Random();

        int sumaLiczb=0;
        int i=1;

        System.out.println("Podaj ile razy chcesz wylosowac liczbe: ");
        int n = inputData.InputInt();

        while(i<=n){

            int wylosowanaLiczba = rand.nextInt(56)-10;
            if(wylosowanaLiczba>0 && wylosowanaLiczba % 2 ==0){
                sumaLiczb +=wylosowanaLiczba;
            }
            System.out.println("Wylosowana liczba: " + wylosowanaLiczba);
            i++;
        }
        System.out.println("Suma liczb wynosi: " + sumaLiczb);
    }


    protected void Task05() {
        System.out.printf("Podaj slowo: ");
        String slowo = inputData.InputString();
        String reversed = new StringBuilder(slowo).reverse().toString();//odwrocenie slowa
        if(slowo.equals(reversed)){//jezeli slow jest takie same jak odwrocone
            System.out.printf("Podane slowo jest palindromem\n");
        }
        else{
            System.out.printf("Podane slowo nie jest palindromem\n");
        }
    }
}
