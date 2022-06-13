package abstract_factory;

public class CzerwonaFabryka extends Fabryka{
    @Override
    public PieszaJednostka stworzPieszaJednostke(JednostkaTyp typ) {
        if (typ == JednostkaTyp.STRZELEC) {
            return new Strzelec(80, 0, 500);
        }
        throw new RuntimeException("Nieznany typ");
    }

    @Override
    public NaziemnaJednostka stworzNaziemnaJednostke(JednostkaTyp typ) {
        if (typ == JednostkaTyp.CZOLG) {
            return new Czolg(200, 0, 8990);
        }
        throw new RuntimeException("Nieznany typ");
    }

    @Override
    public PowietrznaJednostka stworzPowietrznaJednostke(JednostkaTyp typ) {
        if (typ == JednostkaTyp.HELIKOPTER) {
            return new Helikopter(440, 0, 335);
        }
        throw new RuntimeException("Nieznany typ");
    }
}
