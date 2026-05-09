import java.util.Scanner;

public class Zad2_Kacper_Krakowski {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        System.out.println("--- Prosty kalkulator dwuargumentowy ---");

        while (continueProgram) {
            System.out.print("\nPodaj pierwszą liczbę: ");
            double a = scanner.nextDouble();

            System.out.print("Podaj symbol operacji (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Podaj drugą liczbę: ");
            double b = scanner.nextDouble();

            switch (operator) {
                case "+":
                    System.out.println("Wynik: " + (a + b));
                    break;
                case "-":
                    System.out.println("Wynik: " + (a - b));
                    break;
                case "*":
                    System.out.println("Wynik: " + (a * b));
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                    } else {
                        System.out.println("Wynik: " + (a / b));
                    }
                    break;
                default:
                    System.out.println("Błąd: Wprowadzono nieznany symbol operacji arytmetycznej!");
                    break;
            }

            System.out.print("\nCzy chcesz wykonać kolejne obliczenie? (t/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("t")) {
                continueProgram = false;
            }
        }
        
        System.out.println("Koniec programu. Do widzenia!");
        scanner.close();
    }
}