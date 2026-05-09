import java.io.*;
import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        try {
            File plikBazowy = new File("liczby.txt");
            Random rand = new Random();

            try (PrintWriter pw = new PrintWriter(plikBazowy)) {
                for (int i = 0; i < 1000; i++) {
                    int losowa = rand.nextInt(10001) - 5000;
                    pw.println(losowa);
                }
            }

            ArrayList<Integer> lista = new ArrayList<>();
            long suma = 0;
            int licznik = 0;

            try (Scanner sc = new Scanner(plikBazowy)) {
                while (sc.hasNextInt()) {
                    int n = sc.nextInt();
                    lista.add(n);
                    suma += n;
                    licznik++;
                }
            }

            double srednia = (licznik > 0) ? (double) suma / licznik : 0;
            System.out.println("Srednia wynosi: " + srednia);

            try (PrintWriter pwWieksze = new PrintWriter("wieksze.txt");
                 PrintWriter pwMniejsze = new PrintWriter("mniejsze.txt")) {

                for (int liczba : lista) {
                    if (liczba > srednia) {
                        pwWieksze.println(liczba);
                    } else {
                        pwMniejsze.println(liczba);
                    }
                }
            }

            System.out.println("Zadanie zakonczone pomyslnie.");

        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku");
        } catch (IOException e) {
            System.err.println("Blad wejscia / wyjscia");
        }
    }
}
