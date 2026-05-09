import java.util.Scanner;

public class Zad_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Program Sedziowski ---");
        System.out.println("Wylicza srednia ocen po odrzuceniu wartosci skrajnych.");

        char czyPowtorzyc;

        do {
            int liczbaSedziow;
            
            
            do {
                System.out.print("\nPodaj liczbe sedziow (od 3 do 10): ");
                liczbaSedziow = scanner.nextInt();
                if (liczbaSedziow < 3 || liczbaSedziow > 10) {
                    System.out.println("Blad! Liczba sedziow musi byc z przedzialu od 3 do 10.");
                }
            } while (liczbaSedziow < 3 || liczbaSedziow > 10);

            double suma = 0.0;
            double minOcena = 0.0;
            double maxOcena = 0.0;

            for (int i = 1; i <= liczbaSedziow; i++) {
                double ocena;
                
                
                do {
                    System.out.print("Podaj ocene od sedziego " + i + " (od 0 do 10): ");
                    ocena = scanner.nextDouble();
                    if (ocena < 0 || ocena > 10) {
                        System.out.println("Blad! Ocena musi byc z przedzialu 0-10.");
                    }
                } while (ocena < 0 || ocena > 10);

                suma += ocena;

                if (i == 1) {
                    minOcena = ocena;
                    maxOcena = ocena;
                } else {
                    if (ocena < minOcena) minOcena = ocena;
                    if (ocena > maxOcena) maxOcena = ocena;
                }
            }

            double sumaPoOdrzuceniu = suma - minOcena - maxOcena;
            double srednia = sumaPoOdrzuceniu / (liczbaSedziow - 2);

            System.out.println("\n--- Wyniki dla zawodnika ---");
            System.out.println("Odrzucono skrajne oceny: " + minOcena + " (min) oraz " + maxOcena + " (max).");
            System.out.println("Srednia po odrzuceniu skrajnosci: " + srednia);

            System.out.print("\nCzy ocenic kolejnego zawodnika? (Wpisz 't' jesli tak, inna litera zakonczy): ");
            czyPowtorzyc = scanner.next().charAt(0);

        } while (czyPowtorzyc == 't' || czyPowtorzyc == 'T');

        System.out.println("Koniec pracy programu. Dziekuje!");
        scanner.close();
    }
}