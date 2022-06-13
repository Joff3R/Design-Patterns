package decorator;

public class Dekorator extends PrzedmiotBiblioteki{
    protected PrzedmiotBiblioteki przedmiotBiblioteki;

    public Dekorator(PrzedmiotBiblioteki przedmiotBiblioteki) {
        this.przedmiotBiblioteki = przedmiotBiblioteki;
    }

    @Override
    public void Pokaz() {
        if(przedmiotBiblioteki != null){
            przedmiotBiblioteki.Pokaz();
        }
    }
}
