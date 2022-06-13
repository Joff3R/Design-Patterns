package mediator;

public class SpecyficznyObiekt2 extends ObiektWspolpracownika{
    public SpecyficznyObiekt2(Mediator mediator) {
        super(mediator);
    }

    public void Wyslij(String wiadomosc)
    {
        mediator.Wyslij(wiadomosc, this);
    }

    public void Powiadom(String wiadomosc)
    {
        System.out.println("SpecyficznyObiekt2 dostaje wiadomość: " + wiadomosc);
    }
}
