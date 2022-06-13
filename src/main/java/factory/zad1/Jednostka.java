package factory.zad1;

public abstract class Jednostka {

    int zycie;
    int doswiadczenie;
    int silaZniszczen;

    public Jednostka(int zycie, int doswiadczenie, int silaZniszczen) {
        this.zycie = zycie;
        this.doswiadczenie = doswiadczenie;
        this.silaZniszczen = silaZniszczen;
    }
}
