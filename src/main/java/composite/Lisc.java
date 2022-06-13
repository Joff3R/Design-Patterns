package composite;

public class Lisc extends Element{
    public Lisc(String nazwa) {
        super(nazwa);
    }

    @Override
    public void Dodaj(Element c) {
        System.out.println("nie można dodać do liścia");
    }

    @Override
    public void Usun(Element c) {
        System.out.println("nie można usunąć z liścia");
    }

    @Override
    public void Pokaz(int poziom) {
        System.out.println("-".repeat(poziom)+nazwa);
    }
}
