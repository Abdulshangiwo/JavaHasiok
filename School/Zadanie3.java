import java.io.*;
import java.util.*;

public class Zadanie3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("tekst.txt"))) {

            int liczbaWyrazow = 0;
            int liczbaZdan = 0;

            String[] wyjatki = {"np", "dr", "ul", "al", "os", "pl", "pw",
                                 "itp", "itd", "str", "mgr", "inz", "tel",
                                 "ww", "cd", "jw", "ok", "godz", "min"};

            while (sc.hasNext()) {
                String slowoRaw = sc.next();

                String sameLitery = slowoRaw.replaceAll("[^a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ]", "");
                if (!sameLitery.isEmpty()) {
                    liczbaWyrazow++;
                }

                if (slowoRaw.endsWith(".") || slowoRaw.endsWith("?") || slowoRaw.endsWith("!")) {

                    String slowoCzyste = slowoRaw.replaceAll("[.?!]+$", "");

                    boolean czyWyjatek = false;
                    for (String w : wyjatki) {
                        if (slowoCzyste.equalsIgnoreCase(w)) {
                            czyWyjatek = true;
                            break;
                        }
                    }

                    if (!czyWyjatek) {
                        liczbaZdan++;
                    }
                }
            }

            if (liczbaZdan > 0) {
                double srednia = (double) liczbaWyrazow / liczbaZdan;
                System.out.println("Liczba słów: " + liczbaWyrazow);
                System.out.println("Średnia długość zdania: " + srednia);
            } else {
                System.out.println("Nie znaleziono zakończeń zdań.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku");
        }
    }
}
