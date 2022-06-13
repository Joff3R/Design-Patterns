package proxy;

public class KonkretnyFolder extends Folder {
    private String Dane;

    public KonkretnyFolder() {
        System.out.println("KonkretnyFolder: uruchomiony");
        Dane = "Bardzo ważne dane";
    }

    @Override
    public String PobierzDane() {
        return Dane;
    }
}
