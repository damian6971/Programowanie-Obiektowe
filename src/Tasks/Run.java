package Tasks;

import java.util.Scanner;

public class Run {

    //obiekt klasy tasks
    TasksLab01 tasksLab01 = new TasksLab01();
    // obiekt klasy Inputdata
    TasksLab02 tasksLab02 = new TasksLab02();

    TasksLab03 tasksLab03 = new TasksLab03();

    TasksLab04 tasksLab04 = new TasksLab04();

    InputData inputData = new InputData();

    public void RunMain() {

        Menu();
    } // koniec metody runmain


    private void Menu() {
        while (true) {
            System.out.println("\n1. Lab 1");
            System.out.println("2. Lab 2");
            System.out.println("3. Lab 3");
            System.out.println("4. Lab 4");
            System.out.println("5. Lab 5");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz lab: ");

            int chooseLab = inputData.InputInt();

            //wybor labolatoria
            switch (chooseLab) {
                case 1:
                    Lab01();
                    break;
                case 2:
                    Lab02();
                    break;

                case 3:
                    Lab03();
                    break;

                case 4:
                    Lab04();
                    break;

                case 0:
                    System.out.printf("Wyjscie...");
                    return;
                default:
                    System.out.printf("Bledne dane");

            }
        }
    }





    private void Lab01() {
        while(true){
            System.out.println("\n0. Wyjscie");
            System.out.println("1. Task 1 ");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Task 4");
            System.out.println("5. Task 5");
            System.out.println("6. Task 6");
            System.out.println("7. Task 7");
            System.out.println("8. Exit");
            System.out.println("Select a task: ");
            int choose = inputData.InputInt();
            switch (choose){
                    case 0:
                    return;

                    case 1: tasksLab01.Task01();
                    break;

                    case 2: tasksLab01.Task02();
                    break;

                    case 3: tasksLab01.Task03();
                    break;

                    case 4: tasksLab01.Task04();
                    break;

                    case 5: tasksLab01.Task05();
                    break;

                    case 6: tasksLab01.Task06();
                    break;
            }
        }





    }// koniec metody menu


    private void Lab02() {
        while (true) {
            System.out.println("\n0. Wyjscie");
            System.out.println("1. Task 1 ");
            System.out.println("2. Task 3");
            System.out.println("3. Task 4");
            System.out.println("4. Task 5");
            System.out.println("5. Task 6");
            System.out.println("Select a task: ");


            int choose = inputData.InputInt();
            switch (choose) {
                case 0:
                    return;

                case 1:
                    tasksLab02.Task01();
                    break;

                    case 2:
                    tasksLab02.Task03();
                    break;

                    case 3:
                    tasksLab02.Task04();
                    break;

                case 4:
                    tasksLab02.Task04();
                    break;

                case 5:
                    tasksLab02.Task05();
                    break;

                case 6:
                    tasksLab02.Task06();
                    break;
            }
        }

    }

    private void Lab03() {
        while (true) {
            System.out.println("\n0. Wyjscie");
            System.out.println("1. Task 1 ");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Task 4");
            System.out.println("5. Task 5");
            System.out.println("6. Task 6");
            System.out.println("7. Task 7");
            System.out.println("8. Exit");
            System.out.println("Select a task: ");
            int choose = inputData.InputInt();
            switch (choose) {
                case 0:
                    return;

                case 1:
                    tasksLab03.Task01();
                    break;

                case 2: tasksLab03.Task02();
                    break;

                case 3: tasksLab03.Task03();
                    break;

                case 4: tasksLab03.Task04();
                    break;

                case 5: tasksLab03.Task05();
                    break;

            }
        }
    }

    private void Lab04() {
        while (true) {
            System.out.println("\n0. Wyjscie");
            System.out.println("1. Task 1 ");
            System.out.println("2. Task 3");
            System.out.println("3. Task 4");
            System.out.println("4. Task 5");
            System.out.println("5. Task 6");
            System.out.println("Select a task: ");


            int choose = inputData.InputInt();
            switch (choose) {
                case 0:
                    return;

                case 1:
                    tasksLab04.Task01();
                    break;

                case 2:
                    tasksLab04.Task02();
                    break;

                case 3:
                    tasksLab04.Task03();
                    break;

                case 4:
                    tasksLab04.Task04();
                    break;

                case 5:
                    tasksLab04.Task05();
                    break;

                case 6:
                    tasksLab04.Task06();
                    break;
//                case 7:
//                    tasksLab04.Task07();
//                    break;
            }
        }

    }

}// koniec klasy
