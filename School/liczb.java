public class liczb {
    public static void analyze(double a, double b, double c) {
        double max = Math.max(a, Math.max(b, c));
        double min = Math.min(a, Math.min(b, c));
        System.out.println("Max: " + max + ", Min: " + min + ", Średnia: " + ((a+b+c)/3));
    }

    public static void main(String[] args) {
        analyze(10, 20, 15);
    }
}