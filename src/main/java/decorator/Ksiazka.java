package decorator;

public class Ksiazka extends PrzedmiotBiblioteki {
    private String autor;
    private String tytul;

    public Ksiazka(String autor, String tytul, int liczbaKopii) {
        this.autor = autor;
        this.tytul = tytul;
        this.setLiczbaKopii(liczbaKopii);
    }


    @Override
    public void Pokaz() {
        System.out.println("\nKsiazka ---- ");
        System.out.println(" Autor: " + autor);
        System.out.println(" Tytul: " + tytul);
        System.out.println(" Liczba kopii: " + getLiczbaKopii());
    }
}
