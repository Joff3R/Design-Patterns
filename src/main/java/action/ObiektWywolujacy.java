package action;

public class ObiektWywolujacy {
    private Polecenie _polecenie;

    public void UstawPolecenie(Polecenie polecenie) {
        this._polecenie = polecenie;
    }

    public void WykonajPolecenie() {
        _polecenie.Wykonaj();
    }
}
