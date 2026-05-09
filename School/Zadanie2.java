import java.io.*;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("domy.txt"));
             PrintWriter pw = new PrintWriter("wiejskie.txt")) {

            while (sc.hasNextLine()) {
                String linia = sc.nextLine();
                String[] dane = linia.split("-", 4);

                if (dane.length == 4) {
                    String nazwa = dane[0];
                    String kondygnacje = dane[2];
                    String lokalizacja = dane[3];

                    try {
                        double cena = Double.parseDouble(dane[1]);

                        if (kondygnacje.equals("1") && lokalizacja.equalsIgnoreCase("Wies")) {
                            double nowaCena = cena * 0.90; 
                            pw.println(nazwa + "-" + String.format("%.2f", nowaCena) + "-" + kondygnacje + "-" + lokalizacja);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Nieprawidłowa cena w linii: " + linia);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Błąd wejścia / wyjścia");
        }
    }
}
