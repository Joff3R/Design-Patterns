package strategy;

public class Kontekst {
    private Strategia _strategia;

    public Kontekst(Strategia _strategia) {
        this._strategia = _strategia;
    }

    public void ZwrocProblem(){
        _strategia.RozwiazProblem();
    }
}
