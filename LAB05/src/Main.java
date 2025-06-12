public class Main {
    public static void main(String[] args) {

        Run run  = new Run();

        //obiekt klasy Inputdata
        InputData inputData = new InputData();


            while (true){
                System.out.println("\n1. Zadanie 1");
                System.out.println("2. Zadanie 2");
                System.out.println("3. Zadanie 3");
                System.out.println("4. Zadanie 4");
                System.out.println("0. Wyjscie");
                System.out.println("Wybierz zadanie: ");

                int chooseZad = inputData.InputInt();

                //wybor zadan
                switch (chooseZad){
                    case 1:
                        run.Task01();
                        break;
                    case 2:
                        run.Task02();
                        break;
                    case 3:
                       run.Task03();
                        break;
                    case 4:
                       // tasksLab5.Task04();
                        break;
                    case 0:
                        System.out.println("Wyjscie...");
                        return;
                    default:
                        System.out.println("Bledne dane");
                }

    }
}
}