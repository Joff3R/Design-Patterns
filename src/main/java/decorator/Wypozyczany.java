package decorator;

import java.util.ArrayList;
import java.util.List;

public class Wypozyczany extends Dekorator {
    protected List<String> czytelnicy = new ArrayList<>();

    public Wypozyczany(PrzedmiotBiblioteki przedmiotBiblioteki) {
        super(przedmiotBiblioteki);
    }

    @Override
    public void Pokaz() {
        super.Pokaz();
        for (String czytelnik :
                czytelnicy) {
            System.out.println(" Czytelnik: " + czytelnik);
        }
    }

    public void WypozyczPrzdmiot(String imie) {
        czytelnicy.add(imie);
        przedmiotBiblioteki.setLiczbaKopii(przedmiotBiblioteki.getLiczbaKopii() - 1);
    }

    public void ZwrocPrzdmiot(String imie) {
        czytelnicy.remove(imie);
        przedmiotBiblioteki.setLiczbaKopii(przedmiotBiblioteki.getLiczbaKopii() + 1);
    }
}
