package Tasks;

public class TasksLab02 {
    InputData inputData = new InputData();

    protected void Task01(){
        int a =0;
        int b =0;
        int c =0;
        int delta=0;
        int x1=0;
        int x2=0;
        System.out.println("Podaj a: ");
        a = inputData.InputInt();
        System.out.println("Podaj b: ");
        b = inputData.InputInt();
        System.out.println("Podaj b: ");
        c = inputData.InputInt();

        System.out.println("Wzór: " + a + "x^2 " +" + "+ b + "x"+ " + "+ + c);
        delta= (b*b) -4*a*c;
        x1= (int) ((-b- Math.sqrt(delta)) / (2 * a)  );
        x2= (int) ((-b+ Math.sqrt(delta)) / (2 * a)  );
        System.out.println("Delta wynosi: "+delta + " x1: " + x1 + " x2: " + x2);
    }

    protected void Task03() {
        System.out.printf("Podaj x: ");
        int x = inputData.InputInt();
        System.out.printf("Podaj y: ");
        int y = inputData.InputInt();
        System.out.printf("Podaj z: ");
        int z = inputData.InputInt();

        int temp;
        if(x>y){
            temp = x;
            x=y;
            y = temp;
        }

        if(y>z){
            temp = z;
            z = y;
            y = temp;
        }
        if(x>y){
            temp = y;
            y = x;
            x = temp;
        }
        System.out.printf("Posortowane liczby: %d %d %d\n",x,y,z);

    }

    protected void Task04() {
        System.out.printf("Czy pada deszcz ? (true/false): ");
        boolean Deszcz = inputData.InputBool();
        System.out.printf("Czy jest autobus na przystanku (true/false): ");
        boolean Autobus = inputData.InputBool();
        if(Deszcz && Autobus){
            System.out.println("Wez parasol ! ");
            System.out.println("Dostaniesz sie na uczelnie");
        }else if(Deszcz && !Autobus){
            System.out.println("Wez parasol");
            System.out.println("Nie dostaniesz sie na uczelnie");
        } else if (!Deszcz && Autobus) {
            System.out.println("Dostaniesz sie na uczelnie, Miłego dnia i pięknej pogody !");
        }
    }


    protected void Task05() {
        System.out.printf("Czy otrzymałeś premię ? (true/false):");
        boolean Premia = inputData.InputBool();
        System.out.printf("Czy otrzymałeś zniżkę ? (true/false):");
        boolean Znizka = inputData.InputBool();

        if(!Znizka || Premia){
            System.out.println("Możesz kupić samochód !");
            System.out.println("Zniżki na samochód nie ma");
        }else if(!Znizka || !Premia){
            System.out.println("Zakup samochód trzeba odłożyć na później ");
            System.out.println("Zniżki na samochód nie ma");
        }else if(Znizka || Premia){
            System.out.printf("Możesz kupić samochód !");
        }
    }

//    Z wykorzystaniem operatorów logicznych ! (negacja), || (or) napisz metodę, który w zależności od
//    spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
//            • Jeśli nie ma zniżki na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”, „Zniżki
//    na samochód nie ma”;
//• Jeśli nie ma zniżki na samochód lub nie otrzymałeś premii, to „Zakup samochód trzeba odłożyć
//    na później...”, „Zniżki na samochód nie ma”;
//• Jeśli jest zniżka na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”.

    protected void Task06() {
        System.out.println("Podaj a: ");
        int a = inputData.InputInt();
        System.out.println("Podaj b: ");
        int b = inputData.InputInt();

        System.out.printf("Wybierz co chcesz zrobić: 1-Dodawanie 2-Odejmowanie 3-Mnożenie 4-Dzielenie");
        int choose = inputData.InputInt();
        switch(choose){
                case 1:
                System.out.printf("Wynik Dodawania "+ (a + b));
                break;
                case 2:
                    System.out.printf("Odejmowanie " + (a - b));
                    break;
                    case 3:
                        System.out.printf("Mnożenie " + (a*b));
                        break;
            case 4:
                System.out.printf("Dzielenie " + (a/b));
                break;
            default:
                System.out.printf("Brak innej mozliwosci");

        }
    }
}
