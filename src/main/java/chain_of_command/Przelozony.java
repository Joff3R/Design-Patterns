package chain_of_command;

public abstract class Przelozony {
    protected Przelozony przelozony;

    public void UstawPrzelozonego(Przelozony przelozony) {
        this.przelozony = przelozony;
    }

    public abstract void RozpatrzFakture(Faktura faktura);
}
