package chain_of_command;

public class Main {

    public static void main(String[] args) {
        Przelozony marcin = new Menadzer();
        Przelozony luiza = new Kierownik();
        Przelozony marek = new Prezes();

        marcin.UstawPrzelozonego(luiza);
        luiza.UstawPrzelozonego(marek);


        Faktura p = new Faktura(1021, 5050.00, "Delegacja");
        marcin.RozpatrzFakture(p);

        p = new Faktura(1022, 11820.00, "Impreza świąteczna");
        marcin.RozpatrzFakture(p);

        p = new Faktura(1023, 35733.00, "System analityczny");
        marcin.RozpatrzFakture(p);
    }
}
