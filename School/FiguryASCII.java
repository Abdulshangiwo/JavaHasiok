import java.util.Scanner;

public class FiguryASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wybor, rozmiar;

        do {
            System.out.println("\n1. Kwadrat\n2. Trójkąt 1\n3. Trójkąt 2\n4. Ramka\n5. Ramka z przekątnymi\n6. Piramidka\n7. Wyjście");
            wybor = sc.nextInt();
            if (wybor >= 1 && wybor <= 6) {
                System.out.print("Podaj wielkość: ");
                rozmiar = sc.nextInt();
                switch (wybor) {
                    case 1: kwadrat(rozmiar); break;
                    case 2: trojkat1(rozmiar); break;
                    case 3: trojkat2(rozmiar); break;
                    case 4: ramka(rozmiar); break;
                    case 5: ramkaZPrzekatnymi(rozmiar); break;
                    case 6: piramidka(rozmiar); break;
                }
            }
        } while (wybor != 7);
    }

    static void kwadrat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void trojkat1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void trojkat2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void ramka(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void ramkaZPrzekatnymi(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void piramidka(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int j = 0; j < (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}