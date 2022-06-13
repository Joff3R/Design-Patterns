package abstract_factory;

public class Main {

    public static void main(String[] args) {
        Fabryka niebieskaFabryka = new NiebieskaFabryka();
        Fabryka czerwonaFabryka = new CzerwonaFabryka();

        NaziemnaJednostka czerwonyCzolg = czerwonaFabryka.stworzNaziemnaJednostke(JednostkaTyp.CZOLG);
        PieszaJednostka czerwonyWojskowy = czerwonaFabryka.stworzPieszaJednostke(JednostkaTyp.STRZELEC);

        NaziemnaJednostka niebieskiCzolg = niebieskaFabryka.stworzNaziemnaJednostke(JednostkaTyp.CZOLG);
        PieszaJednostka niebieskiWojskowy = niebieskaFabryka.stworzPieszaJednostke(JednostkaTyp.STRZELEC);

        PowietrznaJednostka niebieskiHelikopter = niebieskaFabryka.stworzPowietrznaJednostke(JednostkaTyp.HELIKOPTER);
        PowietrznaJednostka czerwonyHelikopter = czerwonaFabryka.stworzPowietrznaJednostke(JednostkaTyp.HELIKOPTER);

        System.out.println("Czerwony czołg - życie:");
        System.out.println(czerwonyCzolg.zycie);
        System.out.println("Niebieski czołg - życie:");
        System.out.println(niebieskiCzolg.zycie);

        System.out.println(czerwonyWojskowy.zycie);
        System.out.println(niebieskiWojskowy.zycie);

        System.out.println(niebieskiHelikopter.zycie);
        System.out.println(czerwonyHelikopter.zycie);    }
}
