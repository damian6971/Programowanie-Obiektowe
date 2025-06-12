public class Run {

    public void Task01(){
        Punkt punkt1 = new Punkt(2,3);
        Punkt punkt2 = new Punkt(3,4);
        Punkt punkt3 = new Punkt(5,6);

        System.out.println("------ Punkty --------");
        punkt1.opis();
        punkt2.opis();
        punkt3.opis();

        System.out.println("--------- Przesuniecie ------");
        punkt1.przesuniecie(2,3);
        punkt2.przesuniecie(2,3);
        punkt3.przesuniecie(2,3);
        punkt1.opis();
        punkt2.opis();
        punkt3.opis();

        System.out.println("Figura");
        Figura figura = new Figura();
        System.out.println(figura.opis() );

        System.out.println("Prostokąt");
        Prostokat prostokat = new Prostokat(10,6);
        System.out.println("Powierzchnia: " + prostokat.getPowierzchnia() );

        System.out.println("Trójkąt");
        Trojkat trojkat = new Trojkat(8,4);
        System.out.println("Wysokosc: "+ trojkat.wys);
        System.out.println("Podstawa: " + trojkat.podst);

        System.out.println("Kwadrat");
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println("Bok kwadratu: " + kwadrat.getBok());
        System.out.println("Powierzchnia kwadratu: " + kwadrat.getPowierzchnia());


        System.out.println(kwadrat.opis());
        System.out.println(trojkat.opis());
        System.out.println(prostokat.opis());
        System.out.println(figura.opis());


    }

    public void Task02()
    {
        Samochod samochod1 = new Samochod("Audi", "A4", "D", "Bialy", 2015, 10000);
        samochod1.opis();
        System.out.println("-------");
        Samochod samochod2 = new Samochod("Toyota", "Jaris", "C", "Czarny", 2001, 4021);
        samochod2.opis();
        System.out.println("-------");
        Samochod samochod3 = new SamochodOsobowy("Audi", "A4", "D", "Bialy", 2015, 10000, 25, 8, 2);
        samochod3.opis();
    }

    public void Task03(){
        Ksiegarnia ksiegarnia = new Ksiegarnia("Ksiegarnia");

        Ksiazka powiesc1 = new Powiesc("Wiedzmin","Andrzej Sapkowski", 39.99, "Fantasy");
        Ksiazka podrecznik1 = new Podrecznik("Wzorce Projektowe","<AUTOR>", 29.99, "Informatyka");

        ksiegarnia.dodajKsiazke(powiesc1);
        ksiegarnia.dodajKsiazke(podrecznik1);

        ksiegarnia.dodajKlienta(new Klient("Jan", "Kowalski"));
        ksiegarnia.dodajKlienta(new Klient("Dominik", "Nowak"));

        ksiegarnia.opisKsiegarnia();
    }
}
