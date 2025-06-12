Zadania do samodzielnego rozwiązania: 
Zadanie 1 
1. Utwórz projekt zawierający funkcje Main. 
2. Utwórz klasę Punkt, która zawiera publiczne pola (współrzędne): x oraz y. 
3. Dla klasy Punkt zdefiniuj konstruktor bezparametrowy, który zainicjuje początkowe wartości 
atrybutów. 
4. Zdefiniuj drugi konstruktor, który przekazane parametry zapamięta, jako wartości atrybutów: x i y. 
5. Zdefiniuj następujące metody dla klasy punkt: 
• gettery i settery 
• void zeruj(); 
• void opis(); 
• void przesun(int x, int y); 
6. W metodzie main() utwórz trzy obiekty typu Punkt. 
7. Pokaż, w jaki sposób można wykorzystać każdą ze zdefiniowanych metod. 
8. Do pakietu pliki Figury, Prostokąt i Trojkat (udostępnione przez prowadzącego). 
9. Utworzyć obiekty typu Figura, Prostokat i Trojkat. Sprawdzić działanie wybranych metod dla 
utworzonych obiektów. 
10. Zaprojektować klasę Okrag zawierającą pola:  
• środek klasy Punkt – środek okręgu,  
• promień typu double  
oraz metody:  
• getPowierzchnia() zwracająca pole powierzchni,  
• getSrednica() zwracająca średnice  
• setPromien(double p) ustawiająca nowy promień 
• getPromien() zwracająca promień  
• wSrodku(Punkt) sprawdzająca czy dany punkt znajduje się wewnątrz okręgu. Skorzystaj ze 
wzoru: (
 Konstruktory:  
−
 )
 2 2 2
 (
 x a y b r
 + − 
 )
 , 
=
 S ab
 (
 ,
 )
 • Pusty – inicjujący pola wartościami domyślnymi punkt (0,0), promień 0,  
• Określający punkt oraz promień  
11. Zmodyfikować klasę Prostokat i Trojkat, tak, aby dziedziczyły z klasy Figura. 
12. Dodać konstruktor przeciążony dla klasy Prostokat postaci: Prostokat(float wys,float szer, String 
kolor). Wewnątrz konstruktora powinien być wywołany konstruktor z klasy bazowej. 
13. Dodać konstruktor  przeciążony dla klasy Trojkat postaci Trojkat(float wys,float podst,String kolor). 
5 
14. Dodać metodę przesuwającą prostokąt o dane współrzędne void przesun(float x, float y). 
15. Dla obiektu typu Prostokat wywołać metodę przesun(3,5). 
16. Zdefiniować nową klasę Kwadrat dziedziczącą z klasy Prostokat. Umieścić w niej gettery i setery.  
17. Utworzyć dowolny obiekt typu Kwadrat i nadać mu dowolną wartość początkową. 
18. Przysłonić metody opis() we wszystkich klasach. 
19. Dla utworzonych obiektów wywołać metodę opis(), w taki sposób, aby opis o danym obiekcie został 
wyświetlony na konsolę. 
20. Zmodyfikować klasę Okrag zawierającą, tak, aby dziedziczyła po klasie Figura. 
21. Sprawdzić działanie zdefiniowanych metod dla przykładowych obiektów. 
Zadanie 2 
Napisz program, w którym będą dwie klasy: Samochod i SamochodOsobowy. W klasach tych powinny 
znajdować się następujące pola: 
Samochod: Marka, Model, Nadwozie, Kolor, Rok produkcji, Przebieg (nie może być ujemny) 
SamochodOsobowy: Waga (powinna być z przedziału 2 t – 4,5 t), Pojemność silnika (powinna być z 
przedziału 0,8-3,0), Ilość osób 
Klasa SamochodOsobowy dziedziczy po klasie Samochod. W obydwu klasach utwórz konstruktor, 
który pobierze dane od użytkownika. Dodatkowo w klasie Samochod przeciąż konstruktor w taki 
sposób, by wartości pól były parametrami metody. W klasie Samochod utwórz także metodę, która 
wyświetli informacje o samochodzie. Przesłoń ją w klasie SamochodOsobowy. W metodzie Main() 
utwórz obiekt klasy SamochodOsobowy oraz dwa obiekty klasy Samochod (wykorzystując różne 
konstruktory). Wyświetl informacje o samochodach.  
Zadanie 3. 
Należy zaimplementować aplikację wykorzystującą: kompozycję i dziedziczenie, rzutowanie oraz 
operator this i metodę super dla następujących klas Księgarnia, Podręcznik, Powieść, Klient, Książka
