package mediator;

public abstract class ObiektWspolpracownika {
    protected Mediator mediator;

    public ObiektWspolpracownika(Mediator mediator)
    {
        this.mediator = mediator;
    }
}
