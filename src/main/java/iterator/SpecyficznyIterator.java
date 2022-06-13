package iterator;

public class SpecyficznyIterator extends Iterator {
    private SpecyficznyKontener kontener;
    private int obecny = 0;

    public SpecyficznyIterator(SpecyficznyKontener kontener) {
        this.kontener = kontener;
    }

    @Override
    public Object Pierwszy() {
        return kontener.get(0);
    }

    @Override
    public Object Nastepny() {
        Object ret = null;
        if (obecny < kontener.getIlosc() - 1) {
            ret = kontener.get(++obecny);
        }

        return ret;
    }

    @Override
    public boolean CzyKoniec() {
        return obecny >= kontener.getIlosc();
    }

    @Override
    public Object PobierzElement() {
        return kontener.get(obecny);
    }
}
