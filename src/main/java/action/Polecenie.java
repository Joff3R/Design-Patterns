package action;

public abstract class Polecenie {
    protected Odbiorca odbiorca;

    public Polecenie(Odbiorca odbiorca) {
        this.odbiorca = odbiorca;
    }

    public abstract void Wykonaj();
}
