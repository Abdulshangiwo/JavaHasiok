public class Rational {
    private int licznik;
    private int mianownik;

    public Rational(int licznik, int mianownik) {
        if (mianownik == 0) mianownik = 1;
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public Rational add(Rational arg) {
        int gora = (this.licznik * arg.mianownik) + (arg.licznik * this.mianownik);
        int dol = this.mianownik * arg.mianownik;
        return new Rational(gora, dol);
    }

    public Rational sub(Rational arg) {
        int gora = (this.licznik * arg.mianownik) - (arg.licznik * this.mianownik);
        int dol = this.mianownik * arg.mianownik;
        return new Rational(gora, dol);
    }

    public Rational mul(Rational arg) {
        return new Rational(this.licznik * arg.licznik, this.mianownik * arg.mianownik);
    }

    public Rational div(Rational arg) {
        return new Rational(this.licznik * arg.mianownik, this.mianownik * arg.licznik);
    }

    public boolean equals(Rational arg) {
        return (this.licznik * arg.mianownik) == (arg.licznik * this.mianownik);
    }

    public int compareTo(Rational arg) {
        int w1 = this.licznik * arg.mianownik;
        int w2 = arg.licznik * this.mianownik;
        if (w1 == w2) return 0;
        return (w1 > w2) ? 1 : -1;
    }

    public String toString() {
        return this.licznik + "/" + this.mianownik;
    }
}