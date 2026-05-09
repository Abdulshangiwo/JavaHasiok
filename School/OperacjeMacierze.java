import java.util.Random;
import java.util.Arrays;

public class OperacjeMacierze {

    public static void main(String[] args) {
        int[][] macierz = new int[3][3];

        System.out.println("--- Wypełnienie losowe ---");
        wypelnijTablice(macierz, 1, 9);
        drukuj(macierz);

        System.out.println("\n--- Jedynki na przekątnych ---");
        wypelnijTabliceZJednkami(macierz);
        drukuj(macierz);

        System.out.println("\n--- Transpozycja (nowa tablica, 3x2) ---");
        int[][] m2 = {{1, 2}, {3, 4}, {5, 6}};
        drukuj(transponujTablice1(m2));

        System.out.println("\n--- Transpozycja w miejscu (kwadratowa) ---");
        wypelnijTablice(macierz, 10, 20);
        drukuj(macierz);
        System.out.println("Po transpozycji:");
        drukuj(transponujTablice2(macierz));

        System.out.println("\n--- Mnożenie macierzy (A * B) ---");
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        drukuj(mnozenieMacierzy(A, B));
    }

    public static int[][] wypelnijTablice(int[][] t, int min, int max) {
        Random r = new Random();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = r.nextInt(max - min + 1) + min;
            }
        }
        return t;
    }

    public static int[][] wypelnijTabliceZJednkami(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == j || i + j == t.length - 1) {
                    t[i][j] = 1;
                } else {
                    t[i][j] = 0;
                }
            }
        }
        return t;
    }

    public static int[][] transponujTablice1(int[][] t) {
        int wiersze = t.length;
        int kolumny = t[0].length;
        int[][] nowa = new int[kolumny][wiersze];
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                nowa[j][i] = t[i][j];
            }
        }
        return nowa;
    }

    public static int[][] transponujTablice2(int[][] t) {
        if (t.length != t[0].length) return null;
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                int temp = t[i][j];
                t[i][j] = t[j][i];
                t[j][i] = temp;
            }
        }
        return t;
    }

    public static int[][] mnozenieMacierzy(int[][] A, int[][] B) {
        int wA = A.length;
        int kA = A[0].length;
        int kB = B[0].length;
        int[][] C = new int[wA][kB];
        for (int i = 0; i < wA; i++) {
            for (int j = 0; j < kB; j++) {
                for (int k = 0; k < kA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void drukuj(int[][] t) {
        for (int[] wiersz : t) {
            System.out.println(Arrays.toString(wiersz));
        }
    }
}