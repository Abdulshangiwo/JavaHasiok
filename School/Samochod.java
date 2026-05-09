public class Samochod {
    private int vMax;
    private double paliwoWZbiorniku;
    private double zuzycieNa100km;

    public Samochod() {
        this.vMax = 140;
        this.paliwoWZbiorniku = 30.0;
        this.zuzycieNa100km = 6.0;
    }

    public Samochod(int vMax, double paliwoWZbiorniku, double zuzycieNa100km) {
        this.vMax = vMax;
        this.paliwoWZbiorniku = paliwoWZbiorniku;
        this.zuzycieNa100km = zuzycieNa100km;
    }

    public int getVMax() { return vMax; }
    public void setVMax(int vMax) { this.vMax = vMax; }

    public double getPaliwoWZbiorniku() { return paliwoWZbiorniku; }
    public void setPaliwoWZbiorniku(double paliwo) { this.paliwoWZbiorniku = paliwo; }

    public double getZuzycieNa100km() { return zuzycieNa100km; }
    public void setZuzycieNa100km(double zuzycie) { this.zuzycieNa100km = zuzycie; }

    public double zasieg() {
        return (this.paliwoWZbiorniku / this.zuzycieNa100km) * 100;
    }

    public double czasDojazdu(double dystans) {
        double predkoscSrednia = 0.75 * this.vMax;
        return dystans / predkoscSrednia;
    }

    public void zatankuj(double ilePaliwaZatankowano) {
        this.paliwoWZbiorniku += ilePaliwaZatankowano;
    }

    public void trasa(double liczbaKilometrow) {
        double spalone = (liczbaKilometrow / 100) * this.zuzycieNa100km;
        this.paliwoWZbiorniku -= spalone;
    }
}
