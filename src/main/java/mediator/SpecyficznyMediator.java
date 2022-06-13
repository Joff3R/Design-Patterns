package mediator;

public class SpecyficznyMediator extends Mediator{
    private SpecyficznyObiekt1 ObiektWspolpracownika1;
    private SpecyficznyObiekt2 ObiektWspolpracownika2;

    public void setObiektWspolpracownika1(SpecyficznyObiekt1 obiektWspolpracownika1) {
        ObiektWspolpracownika1 = obiektWspolpracownika1;
    }

    public void setObiektWspolpracownika2(SpecyficznyObiekt2 obiektWspolpracownika2) {
        ObiektWspolpracownika2 = obiektWspolpracownika2;
    }

    @Override
    public void Wyslij(String wiadomosc, ObiektWspolpracownika wspolpracownik) {
        if (wspolpracownik == ObiektWspolpracownika1)
        {
            ObiektWspolpracownika2.Powiadom(wiadomosc);
        }
        else

        {
            ObiektWspolpracownika1.Powiadom(wiadomosc);
        }
    }
}
