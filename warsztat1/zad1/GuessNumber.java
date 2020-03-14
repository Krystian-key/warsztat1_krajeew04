package warsztat1.zad1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(101);
        System.out.println(a +" Liczba którą mi wylosowało.");
        System.out.println("Zgadnij liczbę!");
        Scanner scan = new Scanner(System.in);
        int  input =-1;
        while (input != a) {
            try {
                input = scan.nextInt();
                if (input == a) {
                    System.out.println("Trafiłeś, Gratulację!");
                } else if (input > a) {
                    System.out.println("Za dużo, próbuj dalej!");
                } else if (input < a) {
                    System.out.println("Za mało, próbuj dalej!");
                }
                else {
                    System.out.println("Próbuj dalej");
                }


            } catch (java.util.InputMismatchException e){
                System.out.println("Podaj cyfrę,nie literę!");
                scan.nextLine();
            }
        }

    }
}





/*
Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100. Następnie:

wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To nie jest liczba", po czym wrócić do pkt. 1;
jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za mało!", po czym wrócić do pkt. 1;
jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za dużo!", po czym wrócić do pkt. 1;
jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!", po czym zakończyć działanie programu.

Gra w zgadywanie liczb
Przykład:
Zgadnij liczbę: cześć
To nie jest liczba.
Zgadnij liczbę: 50
Za mało!
Zgadnij liczbę: 75
Za dużo!
Zgadnij liczbę: 63
Zgadłeś!

Symulator LOTTO
Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49. Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.

Napisz program, który:

zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
czy wprowadzony ciąg znaków jest poprawną liczbą,
czy użytkownik nie wpisał tej liczby już poprzednio,
czy liczba należy do zakresu 1-49,
po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
poinformuje gracza, czy trafił przynajmniej "trójkę".

 */