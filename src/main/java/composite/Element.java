package composite;

abstract class Element {
    protected String nazwa;

    public Element(String nazwa){
        this.nazwa = nazwa;
    }

    public abstract void Dodaj(Element c);
    public abstract void Usun(Element c);
    public abstract void Pokaz(int poziom);
}
