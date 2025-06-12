Zadania do samodzielnego rozwiązania: 
Zaimplementować aplikację za pomocą interfejsów i klas abstrakcyjnych. 
Zadanie 1. Transport 
Zbuduj system, który obsługuje różne typy pojazdów dostępnych w wypożyczalni (np. samochody, 
rowery, hulajnogi elektryczne). System powinien umożliwiać: 
• dodawanie pojazdów, 
• wypożyczanie, 
• obliczanie kosztu wynajmu, 
• zwracanie pojazdu. 
Zadanie 2.  
1. 
2. 
3. 
4. 
5. 
6. 
7. 
8. 
9. 
Uruchomić i zapoznać się z kodem plików znajdujących się w rozpakowanym pliku. Dołącz 
wszytki do nowego projektu. 
W programie głównym utworzyć reprezentację każdej klasy, która jest w projekcie i zaproponuj 
uruchomienie przykładowych trzech funkcji. 
Zamienić klasę Figura na klasę abstrakcyjną  
Dodaj do klasy Figura metodę abstrakcyjną String opis(),  zwracającą informację o obiekcie, np. 
„Obiekt klasy Prostokat”. 
Zmodyfikować pozostałe klasy, tak, aby program kompilował się poprawnie. 
W programie głównym  utworzyć tablicę o nazwie tablicaFigur o rozmiarze 10 typu Figura. Do 
każdego elementu tablicy  utworzyć nowy obiekt, lub przypisać istniejący. 
Dla każdego obiektu tablicy wywołać metodę opis(). Z której klasy została wywołana metoda opis() 
i dlaczego? 
W klasie Figura zdefiniować dodatkowe metody abstrakcyjne i zaimplementuj je w klasach 
potomnych: 
a) void skaluj(float skala)     //skaluje wielkość figury 
Zdefiniuj interfejs o nazwie IFigury, zawierający następujące metody: 
b) float getPowierzchnia(); 
c) boolean wPolu(Punkt p); 
10. Zaimplementuj interfejs IFigury we wszystkich klasach Prostokat, Trojkat, Kwadrat. 
11. W programie głównym zadeklaruj listę obiektów typu IFigury, następnie przypisz do niej różne 
figury: Prostokat, Kwadrat, Trojkat. 
6 
12. Dla każdego obiektu tablicy IFigur wywołaj metodę getPowierzchnia() i w_polu(). 
Kolejno: 
1. Utwórz klasę Okrag dziedziczącą po klasie Figura 
2. Zdefiniuj interfejs o nazwie RuchFigury, zawierający następującą metodę: 
3. void przesun(int x, int y); 
4. Zaimplementuj interfejs RuchFigury w klasie Okrąg. 
5. Sprawdź działanie interfejsu.
