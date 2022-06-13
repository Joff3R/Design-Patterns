package proxy;

public class Pelnomocnik extends Folder {
    private KonkretnyFolder konkretnyFolder;
    private boolean isAutoryzowany;
    private String haslo = "dobrehaslo";

    public Pelnomocnik(String haslo) {
        if (this.haslo.equals(haslo)) {
            isAutoryzowany = true;
            System.out.println("Pelnomocnik: uruchomiony");
        }
    }

    @Override
    public String PobierzDane() {
        if (isAutoryzowany) {
            if (konkretnyFolder == null) {
                konkretnyFolder = new KonkretnyFolder();
            }
            return "Dane z pelnomocnika to " + konkretnyFolder.PobierzDane();
        } else {
            return "Pełnomocnik odmawia dostepu";
        }
    }
}
