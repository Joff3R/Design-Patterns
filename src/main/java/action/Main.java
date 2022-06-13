package action;

public class Main {

    public static void main(String[] args) {
        Odbiorca odbiorca = new Odbiorca();
        Polecenie polecenie = new SpecyficznePolecenie(odbiorca);
        ObiektWywolujacy wywolujacy = new ObiektWywolujacy();

        wywolujacy.UstawPolecenie(polecenie);
        wywolujacy.WykonajPolecenie();
    }
}
