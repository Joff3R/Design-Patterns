package decorator;

public class Film  extends  PrzedmiotBiblioteki{
    private String rezyser;
    private String tytul;
    private int czasTrwania;

    public Film(String rezyser, String tytul, int czasTrwania, int liczbaKopii) {
        this.rezyser = rezyser;
        this.tytul = tytul;
        this.czasTrwania = czasTrwania;
        this.setLiczbaKopii(liczbaKopii);
    }

    @Override
    public void Pokaz() {
        System.out.println("\nFilm ---- ");
        System.out.println(" Rezyser: " + rezyser);
        System.out.println(" Tytul: " + tytul);
        System.out.println(" Czas trwania: " + czasTrwania);
        System.out.println(" Liczba kopii: " + getLiczbaKopii());
    }
}
