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
