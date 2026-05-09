abstract class Figura {
    public abstract double pole();
    public abstract double obwod();
}

class Kolo extends Figura {
    private double r;
    public Kolo() { this.r = 1.0; }
    public Kolo(double r) { this.r = r; }
    @Override public double pole() { return Math.PI * r * r; }
    @Override public double obwod() { return 2 * Math.PI * r; }
}

class Kwadrat extends Figura {
    private double a;
    public Kwadrat() { this.a = 1.0; }
    public Kwadrat(double a) { this.a = a; }
    @Override public double pole() { return a * a; }
    @Override public double obwod() { return 4 * a; }
}

class Prostokat extends Figura {
    private double a, b;
    public Prostokat() { this.a = 1.0; this.b = 2.0; }
    public Prostokat(double a, double b) { this.a = a; this.b = b; }
    @Override public double pole() { return a * b; }
    @Override public double obwod() { return 2 * (a + b); }
}

class Trapez extends Figura {
    private double a, b, c, d, h;
    public Trapez() { a=5; b=3; c=2; d=2; h=2; }
    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a; this.b = b; this.c = c; this.d = d; this.h = h;
    }
    @Override public double pole() { return ((a + b) * h) / 2; }
    @Override public double obwod() { return a + b + c + d; }
}