package chain_of_command;

public class Faktura {
    public int Numer;
    public double Wartosc;
    public String Cel;

    public Faktura(int numer, double wartosc, String cel) {
        Numer = numer;
        Wartosc = wartosc;
        Cel = cel;
    }

    public int getNumer() {
        return Numer;
    }

    public void setNumer(int numer) {
        Numer = numer;
    }

    public double getWartosc() {
        return Wartosc;
    }

    public void setWartosc(double wartosc) {
        Wartosc = wartosc;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String cel) {
        Cel = cel;
    }
}
