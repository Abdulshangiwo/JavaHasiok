import java.util.Scanner;

public class ZabawyZTekstem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię i nazwisko (oddzielone spacją): ");
        String dane = scanner.nextLine();

        System.out.println("Wielkimi literami: " + dane.toUpperCase());

        int space = dane.indexOf(" ");
        if (space != -1) {
            String nazwisko = dane.substring(space + 1);
            System.out.println("Nazwisko: " + nazwisko);

            if (nazwisko.toLowerCase().endsWith("a")) {
                System.out.println("Nazwisko kończy się na literę 'a'.");
            } else {
                System.out.println("Nazwisko nie kończy się na literę 'a'.");
            }
        } else {
            System.out.println("Nie znaleziono nazwiska (brak spacji).");
        }
        System.out.println("Czy -ski? " + dane.endsWith("ski"));
    }
}