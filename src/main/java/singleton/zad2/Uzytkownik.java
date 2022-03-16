package singleton.zad2;

public class Uzytkownik {

    private static volatile Uzytkownik uzytkownik;
    public String login;
    public String imie;
    public String nazwisko;
    public String token;
    public int wiek;

    private Uzytkownik() {
    }

    public static Uzytkownik zwrocUzytkownika() {
        Uzytkownik result = uzytkownik;
        if (result != null) {
            return result;
        }

        synchronized (Uzytkownik.class) {
            if (uzytkownik == null) {
                uzytkownik = new Uzytkownik();
            }
            return uzytkownik;
        }
    }

    public void zaloguj(String login, String imie, String nazwisko, int wiek, String token) {
        this.login = login;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.token = token;
        this.wiek = wiek;
    }
}
