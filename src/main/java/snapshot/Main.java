package snapshot;

public class Main {

    public static void main(String[] args) {
        Inicjator i = new Inicjator();
        i.setStan("Włącz");

        Zarzadzajacy z = new Zarzadzajacy();
        z.setPamiatka(i.UtworzPamiatke());

        i.setStan("Wyłącz");

        i.UstawPamiatke(z.getPamiatka());
    }
}
