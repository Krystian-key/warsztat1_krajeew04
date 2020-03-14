package warsztat1.zad1;

import java.util.Scanner;


    public class GuessComputerNumber {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int tryNo = 0;

            System.out.println("pomyśl liczbę całkowitą od 0 do 1000, a ja ją zgadnę w max. 10 próbach");

            System.out.println();

            int min = 0;
            int max = 1000;
            while (tryNo < 10) {


                int guess = (max - min) / 2 + min;

                System.out.println("zgaduję:  " + guess);
                System.out.println();
                System.out.println("wciśnij 'M' jeżeli moja liczba jest za mała ");
                System.out.println("wciśnij 'L' jeżeli moją liczba jest za duża ");
                System.out.println("wciśnij 'P' jeżeli zgadłem");
                System.out.println("legenda: 'M' -  More,  'L' - Less, 'P' - Point. ");

                String check = scan.nextLine().toUpperCase();

                if (check.equals("M")) {
                    min = guess;

                    tryNo++;

                } else if (check.equals("L")) {
                    max = guess;

                    tryNo++;
                } else if (check.equals("P")) {
                    System.out.println("zgadłeś");
                    tryNo = 10;

                } else {
                    System.out.println("nie oszukuj");
                }
            }
        }
    }



