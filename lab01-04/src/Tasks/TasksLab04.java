package Tasks;

import java.util.Arrays;
import java.util.Random;

public class TasksLab04 {
    InputData inputData = new InputData();





    protected void Task01(){

        System.out.printf("Podaj rozmiar tablicy: ");
        int rozmiarTablicy = inputData.InputInt();
        int[] tablica = new int[rozmiarTablicy];

        for(int i=0;i<rozmiarTablicy;i++){

            tablica[i] = losujLiczbe(0,100);
            System.out.printf(i+1  + " element tablicy = "+tablica[i] + "\n");
        }

        int suma = 0;
        int srednia =0;

        for(int i=0;i<rozmiarTablicy;i++){
            suma += tablica[i];
            srednia = suma / rozmiarTablicy;
        }
        System.out.printf("Suma: " + suma + "\n");
        System.out.printf("Srednia: " + srednia + "\n");

        System.out.printf("Wypisywanie z tablicy petla foreach \n");

        suma=0;
        srednia=0;
        for(int i : tablica){

            suma += i;
            srednia = suma / tablica.length;

        }
        System.out.println("Suma z tablicy petla foreach: " + suma );
        System.out.println("Srednia z tablicy petla foreach: " + srednia );



    }


    protected void Task02(){
        int[] tablicaParzystych = {1,2,3,4,5,6,7,8,9,10};
        int[] tablicaNieparzystych = {11,12,13,14,15,16,17,18,19};

        for(int i=0;i<tablicaParzystych.length;i+=2){
            System.out.printf("Co drugi element tablicy parzystej: "+tablicaParzystych[i] + "\n");
        }

        for(int i=1;i<tablicaNieparzystych.length;i+=2){
            System.out.printf("Co drugi element tablicy nieparzystej: "+tablicaNieparzystych[i] + "\n");
        }
    }

    private int losujLiczbe(int min,int max){//losowanie liczby z posrod minimalnej-maksymalnej
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }


    protected void Task03(){
        String[] tablicaStringow= {"Jeden", "Dwa","Trzy", "Cztery"};
        System.out.println("Wszystkie elementy tablicy: ");
        for(String element : tablicaStringow){
            System.out.printf(element + "\n");
        }
    }


    protected void Task04(){
        System.out.println("Podaj pięć słów:");
        String[] slowa = new String[5];
        for(int i=0;i<slowa.length;i++){
            System.out.println("Podaj słowo: ");
            slowa[i] = inputData.InputString();
        }

        for(String element : slowa){
            System.out.printf(element + ", ");
        }
        System.out.printf("\n");

        for(int i = slowa.length-1;i>=0;i--){
            String odwroconeSlowo = new StringBuilder(slowa[i]).reverse().toString();
            System.out.printf("Odwrocone slowo: " + odwroconeSlowo + "\n");
        }
    }

    protected void Task05(){
        int[] tablica = new int[8];
        System.out.println("Podaj 8 liczb: ");
        for(int i=0;i<tablica.length;i++){
            System.out.println("Podaj liczbe: ");
            tablica[i] = inputData.InputInt();

        }

        Arrays.sort(tablica);

        for(int element : tablica){
            System.out.printf(element + ", ");
        }

    }

    protected void Task06(){
        System.out.println("Podaj 5 liczb:");
        int[] tablica = new int[5];
        for(int i=0;i<tablica.length;i++){
            System.out.println("Podaj liczbe: ");
            tablica[i] = inputData.InputInt();
        }

    }

}
