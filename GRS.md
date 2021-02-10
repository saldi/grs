# Giga Rodzajów Sortowania

- **Time limit: 1 sec. (C++) / 2 sec. (Java)**
- **Memory limit: 240 MB**

Rodzajów sortowania jest dużo. Ponad miliard (giga!).

Bajtazar wie o tym doskonale. Sortowanie to jego ulubione zagadnienie algorytmiczne.
Ostatnio odnalazł na swoim komputerze folder o nazwie "ze starego komputera".
W środku kryła się między innymi jedna z pierwszych jego własnych implementacji sortowania.
Było to rozwiązanie następującego zadania:

**Zadanie Bajtazara**

Dla ustalonego `k` utworzono ciąg wszystkich liczb naturalnych `k`-cyfrowych.
W tym ciągu każda liczba naturalna `v` o sumie cyfr `s` znajduje się przed wszystkimi liczbami
o sumie cyfr większej od `s` oraz za wszystkimi liczbami o sumie cyfr mniejszej od `s`.
Dodatkowo, jeśli dwie liczby mają taką samą sumę cyfr, to wcześniej znajduje się mniejsza liczba.

Należy napisać funkcję:
```
	void getPosition(char value[], char position[]);
```

Funkcja `getPosition` otrzymuje jako parametr liczbę `value`. Jeśli przyjmiemy, że `value` jest `k` cyfrowa,
to wynikiem funkcji (wynik należy umieścić w buforze `position`) powinna być pozycja,
na której znajduje się liczba `value` w ciągu liczb `k`-cyfrowych
utworzonym zgodnie z powyższym opisem (elementy ciągu numerujemy od `0`).

Parametr `value` jest przekazany do funkcji `getPosition` jako napis w stylu `C`,
tzn. jest to zapis dziesiętny liczby, zakończony znakiem `'\0'`.
Parametr wyjściowy `position` powinien zawierać dziesiętną reprezentację obliczonej wartości
(pozycji liczby `value` w ciągu `k`-cyfrowym) oraz również powinien być zakończony znakiem `'\0'`.
Możesz założyć, że bufor wyjściowy `position` ma wystarczająco duży rozmiar.

**Przykład:**

Ciąg liczb `2`-cyfrowych wygląda tak:
```
  pozycja:  0 |  1  2 |  3  4  5 |  6  7  8  9 | 10 11 12 ... 76 77 78 79 | 80 81 82 83 | 84 85 86 | 87 88 | 89
   liczba: 10 | 11 20 | 12 21 30 | 13 22 31 40 | 14 23 32 ... 68 77 86 95 | 69 78 87 96 | 79 88 97 | 89 98 | 99
suma cyfr:  1 |  2  2 |  3  3  3 |  4  4  4  4 |  5  5  5 ... 14 14 14 14 | 15 15 15 15 | 16 16 16 | 17 17 | 18
```

I jeszcze dla przykładu początek ciągu dla liczb `3`-cyfrowych:
```
  pozycja:   0 |   1   2   3 |   4   5   6   7   8   9 |  10  11  12  13  14  15  16  17  18  19 | ...
   liczba: 100 | 101 110 200 | 102 111 120 201 210 300 | 103 112 121 130 202 211 220 301 310 400 | ...
suma cyfr:   1 |   2   2   2 |   3   3   3   3   3   3 |   4   4   4   4   4   4   4   4   4   4 | ...
```

A zatem np.:
```
getPosition(10); // => 0
getPosition(11); // => 1
getPosition(12); // => 3
getPosition(13); // => 6
getPosition(95); // => 79
getPosition(96); // => 83
getPosition(97); // => 86
getPosition(98); // => 88
getPosition(100); // => 0 (*) w jednym teście mogą pojawiać się zapytania dla różnych wartości 'k'
getPosition(101); // => 1
getPosition(110); // => 2
getPosition(200); // => 3
getPosition(102); // => 4
getPosition(111); // => 5
getPosition(120); // => 6
getPosition(201); // => 7
```

**Ograniczenia:**
- `10 <= value < 100000000000000000000000000000000000000000000000000000000000000000000000000000` *[Uwaga tłumacza: `10 <= value < 10^77`]*,
- maksymalna liczba wywołań funkcji `getPosition`: `8192`.

