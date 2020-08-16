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




