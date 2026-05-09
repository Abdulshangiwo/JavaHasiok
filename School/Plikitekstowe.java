import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Plikitekstowe {
    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter("1000.txt");
            for (int i = 1; i < 1000; i++) {
                int randomNum = (int) (Math.random() * 10001) + -5000;
                out.println(randomNum);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie mozna utworzyc pliku!");
        } finally {
            if (out != null) {
                out.close();
            }
        }
        Scanner in = null;
        try {
            in = new Scanner(new File("1000.txt"));
            while (in.hasNextInt()) {
                out.println(in.nextInt());
            }
        }catch (FileNotFoundException e) {
            System.err.println("Nie mozna znaleziono pliku!");
        }finally {
            if (in != null) {
                in.close();
            }
        }
        if(in.hasNextInt()) {
            
        }
    }
}