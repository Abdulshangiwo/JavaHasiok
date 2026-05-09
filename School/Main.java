import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj hasło:");
        String haslo = sc.nextLine();

        boolean dlugosc = haslo.length() >=12;
        boolean maCyfre = false, maDuzo = false, maMalo = false;

        for (char c:  haslo.toCharArray()) {
            if (Character.isDigit(c)) maCyfre = true;
            if (Character.isLetter(c)) maDuzo = true;
            if (Character.isLetter(c)) maMalo = true;
        }
        if (dlugosc && maCyfre && maDuzo) {
            System.out.println("Hasło spełnia wymagania.");
        }else {
            System.out.println("Hasło nie spełnia wymagań (min. 12 znaków, cyfra, duża i mała litera).\");");
        }
    }
}