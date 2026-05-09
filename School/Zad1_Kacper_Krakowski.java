import java.util.Scanner;

public class Zad1_Kacper_Krakowski {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        // Deklaracja zmiennych współczynników (zastosowano modyfikator final dla stałych)
        final double INCHES_IN_METER = 39.3700787;
        final double FEET_IN_METER = 3.2808399;
        final double YARDS_IN_METER = 1.0936133;
        final double MILES_IN_METER = 0.000621371192;
        
        // Jednostki z rozszerzenia
        final double FATHOMS_IN_METER = 0.546806649;        // sążnie
        final double NAUTICAL_MILES_IN_METER = 0.0005399568; // mile morskie
        final double ANGSTROMS_IN_METER = 10_000_000_000.0;  // angstremy

        System.out.println("--- Program do przeliczania odległości ---");

        while (continueProgram) {
            System.out.print("\nPodaj odległość w metrach: ");
            double meters = scanner.nextDouble();

            if (meters < 0) {
                System.out.println("Błąd: Odległość nie może być ujemna. Spróbuj ponownie.");
            } else {
                System.out.println("Wyniki przeliczeń:");
                System.out.printf("Cale (in): %.4f\n", meters * INCHES_IN_METER);
                System.out.printf("Stopy (ft): %.4f\n", meters * FEET_IN_METER);
                System.out.printf("Jardy (yd): %.4f\n", meters * YARDS_IN_METER);
                System.out.printf("Mile lądowe (mi): %.4f\n", meters * MILES_IN_METER);
                
                System.out.println("\nDodatkowe jednostki:");
                System.out.printf("Sążnie: %.4f\n", meters * FATHOMS_IN_METER);
                System.out.printf("Mile morskie (nmi): %.4f\n", meters * NAUTICAL_MILES_IN_METER);
                System.out.printf("Angstremy: %.4f\n", meters * ANGSTROMS_IN_METER);
            }

            System.out.print("\nCzy chcesz przeliczyć kolejną odległość? (t/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("t")) {
                continueProgram = false;
            }
        }
        
        System.out.println("Koniec programu. Do widzenia!");
        scanner.close();
    }
}