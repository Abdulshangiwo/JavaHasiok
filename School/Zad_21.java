import java.util.Scanner;

public class Zad_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Program: Roczne przychody ---");
        System.out.println("Kalkulator sumy, sredniej oraz min i max z przychodow.");

        System.out.print("\nPodaj dla ilu miesiecy chcesz wprowadzic dane: ");
        int liczbaMiesiecy = scanner.nextInt();

        if (liczbaMiesiecy <= 0) {
            System.out.println("Liczba miesiecy musi byc wieksza od zera!");
            scanner.close(); 
            return;
        }

        double suma = 0.0;
        double minPrzychod = 0.0; 
        double maxPrzychod = 0.0;

        for (int i = 1; i <= liczbaMiesiecy; i++) {
            System.out.print("Podaj przychod za miesiac " + i + ": ");
            double przychod = scanner.nextDouble();

            suma += przychod;

            if (i == 1) {
                minPrzychod = przychod;
                maxPrzychod = przychod;
            } else {
                if (przychod < minPrzychod) {
                    minPrzychod = przychod;
                }
                if (przychod > maxPrzychod) {
                    maxPrzychod = przychod;
                }
            }
        }

        double srednia = suma / liczbaMiesiecy;

        System.out.println("\n--- Podsumowanie ---");
        System.out.println("Suma przychodow: " + suma);
        System.out.println("Sredni przychod miesieczny: " + srednia);
        System.out.println("Minimalny przychod: " + minPrzychod);
        System.out.println("Maksymalny przychod: " + maxPrzychod);

        scanner.close();
    }
}