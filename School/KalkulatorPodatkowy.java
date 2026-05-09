import java.util.Scanner;
public class KalkulatorPodatkowy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj dochód: ");
        double dochod = sc.nextDouble();
        double podatek;

        if (dochod <= 120000) {
            podatek = dochod * 0.12;
        } else {
            podatek = (120000 * 0.12) + ((dochod - 120000) * 0.32);
        }

        System.out.println("Podatek wynosi: " + podatek + " zł");
    }
}