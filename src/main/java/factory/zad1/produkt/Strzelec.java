package factory.zad1.produkt;

import factory.zad1.Jednostka;

public class Strzelec extends Jednostka {

    public Strzelec(int zycie, int doswiadczenie, int silaZniszczen) {
        super(zycie, doswiadczenie, silaZniszczen);
        System.out.println("Jestem strzelcem!");
    }
}
