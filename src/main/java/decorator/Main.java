package decorator;

public class Main {

    public static void main(String[] args) {
        Ksiazka ksiazka = new Ksiazka("Qwe", "Asd", 5);
        ksiazka.Pokaz();

        Film film = new Film("Poi", "Lkj", 2, 9);
        film.Pokaz();

        System.out.println("\nDodawanie funkcjonalnosci wypozyczenia do filmu: ");

        Wypozyczany dostepnyFilm = new Wypozyczany(film);
        dostepnyFilm.WypozyczPrzdmiot("CzytelnikA");
        dostepnyFilm.WypozyczPrzdmiot("CzytelnikB");

        dostepnyFilm.Pokaz();

        System.out.println("");
    }
}
