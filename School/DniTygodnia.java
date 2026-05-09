import java.util.Scanner;
 class DniTygodnia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj numer dnia (1-7): ");
        int dzien = sc.nextInt();

        String nazwa = switch (dzien) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Niepoprawny numer";
        };
        System.out.println(nazwa);
    }
}