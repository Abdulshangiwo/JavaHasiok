public class PrzycinanieIZamiana {
    public static void main(String[] args) {
        String tekstPierwotny = "  Lubię programować w Pythonie  ";

        String tekstPrzetworzony = tekstPierwotny
                .trim()
                .replace("Pythonie", "Javie");

        System.out.println("Tekst przed: [" + tekstPierwotny + "]");
        System.out.println("Tekst po:    [" + tekstPrzetworzony + "]");
    }
}