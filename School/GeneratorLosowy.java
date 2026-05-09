public class GeneratorLosowy {
    public static void main(String[] args) {
        int losowa = (int)(Math.random() * 100) + 1;

        System.out.println("Wylosowana liczba: " + losowa);

        if (losowa % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}