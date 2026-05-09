import java.util.Scanner;
public class RokPrzestepny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int rok = sc.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
            System.out.println("To jest rok przestępny.");
        } else {
            System.out.println("To nie jest rok przestępny.");
        }
    }
}