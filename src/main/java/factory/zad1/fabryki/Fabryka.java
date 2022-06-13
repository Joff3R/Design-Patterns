package factory.zad1.fabryki;

import factory.zad1.Jednostka;
import factory.zad1.JednostkaTyp;

public interface Fabryka {

    Jednostka stworzJednostke(JednostkaTyp type);
}
