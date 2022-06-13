package bridge;

public class Main {

    public static void main(String[] args) {
        Abstrakcja ab = new AbstrakcjaPochodna();

        ab.setImplementacja(new SpecyficznaImplementacja());
        ab.MetodaImplementacji();

        ab.setImplementacja(new JakasInnaImplementacja());
        ab.MetodaImplementacji();
    }
}
