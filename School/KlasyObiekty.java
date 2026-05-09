public static void main(String[] args){
        System.out.println("Klasy obiekty");
        System.out.println("Samochod");
        Samochod samochod = new Samochod();
        System.out.println("Zasięg na starcie: " + samochod.zasieg() + " km");
        System.out.println("Czas dojazdu (300 km): " + samochod.czasDojazdu(300) + " h");
        samochod.trasa(100);
        System.out.println("Paliwo po trasie 100km: " + samochod.getPaliwoWZbiorniku()  + "l");
        samochod.zatankuj(10);
        System.out.println("Paliwo po dotankowaniu 10:  " + samochod.getPaliwoWZbiorniku() + "l");
        System.out.println("Figura");
        Figura k = new Kolo(5);
        Figura p = new Prostokat(4,5);
        System.out.println("Koło - Pole: " + k.pole() + ", Obwód: " + k.obwod());
        System.out.println("Prostokąt - Pole: " + p.pole() + ", Obwód: " + p.obwod());
        System.out.println("Rational");
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(2, 4);
        Rational r3 = new Rational(1, 3);
        Rational suma = r1.add(r3);
        System.out.println(r1 + " + " + r3 + " = " + suma);
        System.out.println("Czy 1/2 == 2/4?: " + r1.equals(r2));
        System.out.println("Compare 1/2 do 1/3: " + r1.compareTo(r3));
        }

