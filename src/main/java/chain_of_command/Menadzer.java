package chain_of_command;

public class Menadzer extends Przelozony {

    @Override
    public void RozpatrzFakture(Faktura faktura) {
        if (faktura.Wartosc < 10000.0) {
            System.out.println(this.getClass().getName() + " zaakceptowano fakture o numerze " + faktura.Numer);
        } else if (przelozony != null) {
            przelozony.RozpatrzFakture(faktura);
        }
    }
}
