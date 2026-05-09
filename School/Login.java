import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String VALID_LOGIN = "admin";
        final String VALID_PASSWORD = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("login: ");
        String inputLogin = scanner.nextLine();

        System.out.print("haslo: ");
        String inputPassword = scanner.nextLine();

        if (inputLogin.equals(VALID_LOGIN) && inputPassword.equals(VALID_PASSWORD)) {
            System.out.println("zalogowano");
        } else {
            System.out.println("bledne haslo lub login");
        }
    }
}