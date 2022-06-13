package iterator;

import java.util.ArrayList;

public class SpecyficznyKontener extends Kontener {
    private ArrayList<Object> elementy;
    private int Ilosc;

    public SpecyficznyKontener() {
        this.elementy = new ArrayList<>();
    }

    @Override
    public Iterator StworzIterator() {
        return new SpecyficznyIterator(this);
    }

    public int getIlosc() {
        return elementy.size();
    }

    public Object get(int index) {
        return elementy.get(index);
    }

    public void set(int index, Object object) {
        elementy.add(index, object);
    }
}
