import java.util.Scanner;

public class kalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter customer age: ");
        int age = scanner.nextInt();

        double discount = 0.0;

        if (age < 18) {
            discount = 0.20; // 20% discount
        } else if (age > 65) {
            discount = 0.30; // 30% discount
        }

        double finalPrice = price * (1 - discount);

        // Formatting the output to 2 decimal places using String.format
        String result = String.format("Final price: %.2f USD", finalPrice);
        System.out.println(result);
    }
}