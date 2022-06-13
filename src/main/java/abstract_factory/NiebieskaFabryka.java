package abstract_factory;

public class NiebieskaFabryka extends Fabryka{
    @Override
    public PieszaJednostka stworzPieszaJednostke(JednostkaTyp typ) {
        if (typ == JednostkaTyp.STRZELEC) {
            return new Strzelec(25, 0, 5);
        }
        throw new RuntimeException("Nieznany typ");
    }

    @Override
    public NaziemnaJednostka stworzNaziemnaJednostke(JednostkaTyp typ) {
        if (typ == JednostkaTyp.CZOLG) {
            return new Czolg(100, 0, 25);
        }
        throw new RuntimeException("Nieznany typ");
    }

    @Override
    public PowietrznaJednostka stworzPowietrznaJednostke(JednostkaTyp typ) {
        if (typ == JednostkaTyp.HELIKOPTER) {
            return new Helikopter(50, 0, 25);
        }
        throw new RuntimeException("Nieznany typ");
    }
}
