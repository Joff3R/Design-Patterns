package flyweight;

public class Main {

    public static void main(String[] args) {
        int daneZewnetrzne = 42;

        FabrykaPylkow fabryka = new FabrykaPylkow();

        SpecyficznyPylek pylek1 = (SpecyficznyPylek) fabryka.GetPylek("Q");
        pylek1.PrzykladowaMetoda(--daneZewnetrzne);
        SpecyficznyPylek pylek2 = (SpecyficznyPylek) fabryka.GetPylek("W");
        pylek2.PrzykladowaMetoda(--daneZewnetrzne);
        SpecyficznyPylek pylek3 = (SpecyficznyPylek) fabryka.GetPylek("E");
        pylek3.PrzykladowaMetoda(--daneZewnetrzne);

    }
}
