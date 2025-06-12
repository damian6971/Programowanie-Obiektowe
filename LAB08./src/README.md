Zadania do samodzielnego rozwiązania: 
Zadanie 1.  
Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia 
pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną 
rzuć wyjątek java.lang.IllegalArgumentException. Obsłuż sytuację, w której użytkownik poda ciąg 
znaków, który nie jest liczbą.  
Zadanie 2.  
Napisz metodę, która będzie zwracać silnię podanej jako argument liczby. Metoda powinna rzucać 
wyjątek rodzaju Checked zdefiniowanego przez Ciebie typu BlednaWartoscDlaSilniException, gdy jej 
argument będzie ujemny. Skorzystaj z tej metody w main, obsługując potencjalny wyjątek. 
Zadanie 3. 
Napisz program z klasą Adres, która będzie miała podane poniżej pola, które będą ustawiane w 
konstruktorze klasy Adres. Konstruktor powinien sprawdzić wszystkie podane wartości i rzucić wyjątek 
NieprawidlowyAdresException rodzaju Checked, jeżeli któraś z wartości będzie nieprawidłowa. 
Uwaga: komunikat rzucanego wyjątku powinien zawierać informację o wszystkich nieprawidłowych 
wartościach przekazanych do konstruktora – dla przykładu, jeżeli ulica i miasto będą miały wartość null, 
to komunikat wyjątku powinien być następujący: "Ulica nie może być nullem. Miasto nie może być 
nullem". Pola klasy: String ulica – wartość nieprawidłowa to null, int numerDomu – wartość 
nieprawidłowa to liczba <= 0, String kodPocztowy – wartość nieprawidłowa to null, String 
miasto – wartość nieprawidłowa to null.
