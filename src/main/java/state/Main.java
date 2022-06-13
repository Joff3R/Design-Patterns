package state;

public class Main {

    public static void main(String[] args) {
        Kontekst k = new Kontekst(new SpecyficznyStanA());

        k.Zapytaj();
        k.Zapytaj();
        k.Zapytaj();
        k.Zapytaj();
    }
}
