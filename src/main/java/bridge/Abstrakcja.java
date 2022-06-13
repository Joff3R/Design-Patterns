package bridge;

public class Abstrakcja {
    protected Implementacja implementacja;

    public void setImplementacja(Implementacja implementacja) {
        this.implementacja = implementacja;
    }

    public void MetodaImplementacji(){
        implementacja.MetodaImplementacja();
    }
}
