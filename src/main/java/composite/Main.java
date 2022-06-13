package composite;

public class Main {

    public static void main(String[] args) {
        Kompozyt root = new Kompozyt("root");
        root.Dodaj(new Lisc("Lisc A"));
        root.Dodaj(new Lisc("Lisc B"));

        Kompozyt comp = new Kompozyt("Kompozyt X");
        comp.Dodaj(new Lisc("Lisc XA"));
        comp.Dodaj(new Lisc("Lisc XB"));

        root.Dodaj(comp);
        root.Dodaj(new Lisc("Lisc C"));

        Lisc leaf = new Lisc("Lisc D");
        root.Dodaj(leaf);
        root.Usun(leaf);

        root.Pokaz(1);

    }
}
