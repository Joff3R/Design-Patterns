package template_method;

public class Main {

    public static void main(String[] args) {
        KlasaAbstrakcyjna aA = new SpecyficznaKlasaA();
        aA.MetodaSzablonowa();

        KlasaAbstrakcyjna aB = new SpecyficznaKlasaB();
        aB.MetodaSzablonowa();
    }
}
