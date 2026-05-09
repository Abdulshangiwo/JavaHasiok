import java.util.Scanner;
import java.util.Random;

public class Zad3_Kacper_Krakowski {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueProgram = true;

        System.out.println("--- Gra w 'za dużo, za mało' ---");

        while (continueProgram) {
            System.out.print("\nPodaj górny zakres losowanych liczb (np. wpisz 10 dla zakresu od 1 do 10). \nWpisz 0, aby zagrać na domyślnych zasadach (zakres od -200 do 200): ");
            int upperLimit = scanner.nextInt();
            
            int targetNumber;
            if (upperLimit > 0) {
                // Losowanie z zakresu od 1 do upperLimit włącznie
                targetNumber = random.nextInt(upperLimit) + 1; 
                System.out.println("Komputer wylosował liczbę z zakresu [1; " + upperLimit + "]. Zgaduj!");
            } else {
                // Losowanie z zakresu od -200 do 200
                targetNumber = random.nextInt(401) - 200; 
                System.out.println("Komputer wylosował liczbę z zakresu [-200; 200]. Zgaduj!");
            }

            int attempts = 0;
            boolean isGuessed = false;

            while (!isGuessed) {
                System.out.print("Podaj swoją propozycję: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Za mało!");
                } else if (guess > targetNumber) {
                    System.out.println("Za dużo!");
                } else {
                    System.out.println("\nBRAWO! Odgadłeś liczbę w " + attempts + " próbach!");
                    isGuessed = true;
                }
            }

            System.out.print("\nCzy chcesz zagrać jeszcze raz? (t/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("t")) {
                continueProgram = false;
            }
        }
        
        System.out.println("Dzięki za grę. Do zobaczenia!");
        scanner.close();
    }
}