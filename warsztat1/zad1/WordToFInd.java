package warsztat1.zad1;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WordToFInd {

    public static void main(String[] args) {

        String[] excludedWords = {"śmierć", "koronawirus", "dokładna", "zakazy", "bo", "lekarzy", "zakażonych"};

        Connection connect = Jsoup.connect("http://www.onet.pl/");

        try {
            Document document = connect.get();
            Elements links = document.select("span.title");
            FileWriter fileWriter = new FileWriter("popular_words.txt", true);
            for (Element elem : links) {
                try {
                    fileWriter.append(elem.text() + "\n");
                } catch (IOException e) {
                    System.out.println("Brak dostępu do pliku");
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Brak połączenia");
        }

        File file = new File("popular_words.txt");
        StringBuilder strBuild = new StringBuilder();

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                strBuild.append(scan.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }


        String temp = strBuild.toString().toLowerCase().replaceAll("\"", "").replaceAll("\\.", "").replaceAll(",", "").replaceAll("\\?", "");
        String[] compareWords = temp.split(" ");

        for (int i = 0; i < compareWords.length; i++) {
            for (int j = 0; j < excludedWords.length; j++) {
                if (compareWords[i].equals(excludedWords[j])) {
                    compareWords[i] = "";
                }
            }
        }

        for (String word : compareWords) {
            if (word.length() > 3) {
                try {
                    FileWriter fileWriter = new FileWriter("filtered_popular_words.txt", true);
                    fileWriter.append(word + "\n");
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Brak dostępu do pliku");
                }
            }
        }

    }
}
