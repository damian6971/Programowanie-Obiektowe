package Tasks;

import java.util.Random;

public class TasksLab01 {
   InputData inputData = new InputData();

   private String name = "Damian Kania";
   private int age = 20;

   protected void Task01() {
      System.out.printf(name + " " + age);
   }

   protected void Task02() {
      System.out.printf("Podaj a: ");
      int a = inputData.InputInt();
      System.out.printf("Podaj b: ");
      int b = inputData.InputInt();

      int suma = a + b;
      System.out.println("Suma: " + suma);

      int roznica = a - b;
      System.out.println("Roznica: " + roznica);

      int iloczyn = a * b;
      System.out.println("Iloczyn: " + iloczyn);

      int iloraz = a / b;
      System.out.println("Iloraz: " + iloraz);
   }

   protected void Task03() {
      System.out.printf("Podaj liczbe do sprawdzenia ");
      int liczba = inputData.InputInt();
      if (liczba % 2 == 0) {
         System.out.printf("true");
      } else {
         System.out.printf("false");
      }
   }

   protected void Task04(){
      System.out.printf("Sprawdz czy podana liczba ");
      int liczba = inputData.InputInt();
      if(liczba % 3 ==0 && liczba % 5 == 0){
         System.out.printf("true");
      }
   }

   protected void Task05(){
      System.out.printf("Podaj liczbę którą chcesz podnieść do 3 potęgi");
      int liczba = inputData.InputInt();
      int potega = (int) Math.pow(liczba,3);
      System.out.printf("Twoja liczba podniesiona do potegi 3 to: " + potega);
   }

   protected void Task06(){
      System.out.printf("Podaj liczbe do pierwiastkowania");
      float liczba = inputData.InputFloat();
      float pierwiastek = (float) Math.sqrt(liczba);
      System.out.printf("Pierwiastek z liczby: "+ liczba + "Wynosi: "+ pierwiastek);
   }


}



