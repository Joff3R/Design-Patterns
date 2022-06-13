package decorator;

public abstract class PrzedmiotBiblioteki {
    public int LiczbaKopii;
    private int _liczbaKopii;

    public int getLiczbaKopii() {
        return _liczbaKopii;
    }

    public void setLiczbaKopii(int liczbaKopii) {
        _liczbaKopii = liczbaKopii;
    }

    public abstract void Pokaz();
}
