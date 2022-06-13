package adapter;

public class Adapter extends ElementDocelowy {
    private Adaptowany adaptowany = new Adaptowany();

    @Override
    public void MetodaA() {
        adaptowany.MetodaAdaptowanego();
    }
}
