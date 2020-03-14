package warsztat1.zad1;

import java.util.*;

public class Lotto {
    private static Lotto zad2;

    public static void main(String[] args) {

        System.out.println("witamy w symulatorze lotto, podaj swoje szczęśliwe liczby");

        Integer[] input = new Integer[6];
        int[] tabLosu = new int[6];

        zad2.losowanie(tabLosu);
        zad2.lotto(input);

        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        System.out.println();
        System.out.println("liczby wygrywające to " + Arrays.toString(tabLosu));
        System.out.println();
        System.out.println("Gratulacje trafiłeś " + sprawdzanie(tabLosu, input) + " z 6 liczb.");

    }

    public static void lotto(Integer[] input) {
        Scanner scan = new Scanner(System.in);

        try {
            for (int i = 0; i < input.length; i++) {
                int liczba;
                do {
                    do {
                        System.out.println("podaj liczbę nr " + (i + 1) + " z zakresu 1-49");
                        liczba = scan.nextInt();

                    } while (liczba < 1 || liczba > 49);
                } while (Arrays.asList(input).contains(liczba));
                input[i] = liczba;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbę całkowitą.");
            lotto(input);
        }

    }


    public static void losowanie(int[] los) {
        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(arr));
        for (int i = 0; i < los.length; i++) {
            los[i] = arr[i];
        }


    }

    public static int sprawdzanie(int[] los, Integer[] input) {
        int result = 0;
        for (int value : input) {
            for (int lo : los) {
                if (value == lo) {
                    result++;
                }
            }
        }


        return result;

    }


}


/*

//Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49.
// Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.
//
//Napisz program, który:
//
//zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
//czy wprowadzony ciąg znaków jest poprawną liczbą,
//czy użytkownik nie wpisał tej liczby już poprzednio,
//czy liczba należy do zakresu 1-49,
//po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
//wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
//poinformuje gracza, czy trafił przynajmniej "trójkę"

 */
/*
public class zad2 {
    public static void main(String[] args) {

        System.out.println("witamy w symulatorze lotto zaraz nastąpi losowanie");

        Integer[] input = new Integer[6];
        int[] los = new int[6];

        zad2.losowanie(los);

        zad2.lotto(input);

        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        System.out.println();
        System.out.println("liczby wygrywające to "+Arrays.toString(los));
        System.out.println();
        System.out.println("Gratulacje trafiłeś " + sprawdzanie(los, input) + " z 6 liczb.");

    }

    public static void lotto(Integer[] input) {
        Scanner scan = new Scanner(System.in);

        try {
            for (int i = 0; i < input.length; i++) {
                int liczba;
                do {
                    do {
                        System.out.println("podaj liczbę nr " + (i + 1) + " z zakresu 1-49");
                        liczba = scan.nextInt();

                    } while (liczba < 1 || liczba > 49);
                } while (Arrays.asList(input).contains(liczba));
                input[i] = liczba;
            }
        } catch (InputMismatchException e) {
            System.out.println("Musisz podać liczbę -----> spróbuj jeszcze raz!!!");
            lotto(input);
        }

    }


    public static void losowanie(int[] los) {
        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(arr));
        for (int i = 0; i < los.length; i++) {
            los[i] = arr[i];
        }


    }

    public static int sprawdzanie(int[] los, Integer[] input) {
        int result = 0;
        for (int value : input) {
            for (int lo : los) {
                if (value == lo) {
                    result++;
                }
            }
        }


        return result;

    }


}

 */