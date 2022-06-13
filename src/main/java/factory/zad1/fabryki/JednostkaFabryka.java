package factory.zad1.fabryki;

import factory.zad1.produkt.Czolg;
import factory.zad1.Jednostka;
import factory.zad1.JednostkaTyp;
import factory.zad1.produkt.Strzelec;

public class JednostkaFabryka implements Fabryka {

    public Jednostka stworzJednostke(JednostkaTyp type) {

        return switch (type) {
            case CZOLG -> new Czolg(100, 0, 20);
            case STRZELEC -> new Strzelec(25, 0, 10);
        };
    }
}
