package warsztat1.zad1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 2 D 10 + 10
public class KostkaDoGry {
    public static void main(String[] args) {
        System.out.println("Aby zagrać wpisz rzuć + typ kostki");
        System.out.println("2D10+10 – 2 rzuty D10 - rodzaj kostki, do wyniku dodaj 10,");
        Scanner scanner = new Scanner(System.in);
        String diceString = scanner.nextLine();
        Random r = new Random(1-101);
        int[] typeOfDices = {3, 4, 6, 8, 10, 12, 20, 100};
        int sum = 0;
        String[] diceArray = diceString.split(" ");// diceArray[0] trzyma słowo rzuc
        if (diceArray[0].toLowerCase().equals("rzuć")) {
            String[] numberArray = diceArray[1].split("[+-\\-]"); // numberArray[1] trzyma liczbe którą trzeba dodać lub odjąć
            String[] typeOfArray = numberArray[0].split("[D]"); // typeOfArray[0] liczba rzutów koścmi , typeOfArray[2] rodzaj kostek
            String[] anotherThrowCount = diceArray[1].split("[\\w]"); // + lub -
            if (!typeOfArray[0].equals("")) {
                for (int i : typeOfDices) {
                    if (i == Integer.parseInt(typeOfArray[1])) {
                        if (numberArray.length == 2) {
                            int numb = (Integer.parseInt(typeOfArray[0]));
                            do {
                                numb--;
                                int i1 = r.nextInt(Integer.parseInt(typeOfArray[1]) + 1);
                                sum = sum + i1;
                            } while (numb != 0);
                            if (anotherThrowCount[anotherThrowCount.length - 1].equals("+")) {
                                sum = sum + Integer.parseInt(numberArray[1]);
                            } else {
                                sum = sum - Integer.parseInt(numberArray[1]);
                            }
                        } else {
                            int numb = (Integer.parseInt(typeOfArray[0]));
                            do {
                                numb--;
                                int i1 = r.nextInt(Integer.parseInt(typeOfArray[1]) + 1);
                                sum = sum + i1;
                            } while (numb != 0);
                        }
                    }
                }
            } else {
                for (int i : typeOfDices) {
                    if (i == Integer.parseInt(typeOfArray[1])) {
                        if (numberArray.length == 2) {
                            int i1 = r.nextInt(Integer.parseInt(typeOfArray[1]) + 1);
                            sum = sum + i1;
                        if (anotherThrowCount[anotherThrowCount.length - 1].equals("+")) {
                            sum = sum + Integer.parseInt(numberArray[1]);
                        } else {
                            sum = sum - Integer.parseInt(numberArray[1]);
                        }
                    } else {
                        int i1 = r.nextInt(Integer.parseInt(typeOfArray[1]) + 1);
                        sum = sum + i1;
                    }
                }
            }
        } System.out.println("suma = "+sum);
    }else {
            System.out.println("Zachowaj formułę! rzuć + (ilość rzutów),(rodzaj kostki)");
        }


    }
}


