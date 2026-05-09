public class PorownywanieStringow {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");

        System.out.println("String a: " + a);
        System.out.println("String b: " + b);

        System.out.println("Wynik a == b: " + (a == b));

        System.out.println("Wynik a.equals(b): " + a.equals(b));
    }
}