import java.util.Scanner;
import java.util.Arrays;

public class StatystykaDochodow {
    static Scanner skaner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] dochody = new double[12];
        boolean dziala = true;

        while (dziala) {
            wyswietl_menu();
            char wybor = skaner.next().charAt(0);

            switch (wybor) {
                case '1': wczytaj_dochody(dochody); break;
                case '2': wyswietl_dochody(dochody); break;
                case '3': srednia_suma_dochodow(dochody); break;
                case '4': maksymalny_minimalny_dochod(dochody); break;
                case '5': sortuj(dochody); break;
                case '6': pod_nad_srednim_dochodem(dochody); break;
                case '0': dziala = false; break;
                default: System.out.println("Niepoprawny wybór!");
            }
        }
    }

    static void wyswietl_menu() {
        System.out.println("\n--- MENU DOCHODÓW ---");
        System.out.println("1. Wczytaj dochody");
        System.out.println("2. Wyświetl dochody");
        System.out.println("3. Średnia i suma");
        System.out.println("4. Max i min");
        System.out.println("5. Sortuj");
        System.out.println("6. Pod i nad średnią");
        System.out.println("0. Koniec");
        System.out.print("Wybierz opcję: ");
    }

    static void wczytaj_dochody(double[] dochody) {
        for (int i = 0; i < dochody.length; i++) {
            System.out.print("Miesiąc " + (i + 1) + ": ");
            dochody[i] = skaner.nextDouble();
        }
    }

    static void wyswietl_dochody(double[] dochody) {
        System.out.println("Zapisane dochody: " + Arrays.toString(dochody));
    }

    static void srednia_suma_dochodow(double[] dochody) {
        double suma = 0;
        for (double d : dochody) suma += d;
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + (suma / dochody.length));
    }

    static void maksymalny_minimalny_dochod(double[] dochody) {
        double min = dochody[0], max = dochody[0];
        for (double d : dochody) {
            if (d < min) min = d;
            if (d > max) max = d;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    static void sortuj(double[] dochody) {
        Arrays.sort(dochody);
        System.out.println("Posortowano dochody.");
    }

    static void pod_nad_srednim_dochodem(double[] dochody) {
        double suma = 0;
        for (double d : dochody) suma += d;
        double srednia = suma / dochody.length;

        System.out.print("Powyżej średniej (" + srednia + "): ");
        for (double d : dochody) if (d > srednia) System.out.print(d + " ");

        System.out.print("\nPoniżej średniej: ");
        for (double d : dochody) if (d < srednia) System.out.print(d + " ");
        System.out.println();
    }
}