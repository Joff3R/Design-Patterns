package chain_of_command;

public class Prezes extends Przelozony {
    @Override
    public void RozpatrzFakture(Faktura faktura) {
        if (faktura.Wartosc < 30000.0) {
            System.out.println(this.getClass().getName() + " zaakceptowano fakture o numerze " + faktura.Numer);
        } else {
            System.out.println("Faktura o numerze " + faktura.getNumer() + " wymaga konsultacji!");
        }
    }
}
