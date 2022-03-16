package singleton.zad2;

public class Client {

    public static void main(String[] args) {

        Uzytkownik uzytkownik = Uzytkownik.zwrocUzytkownika();
        Uzytkownik uzytkownikWInnymMiejscu = Uzytkownik.zwrocUzytkownika();

        uzytkownik.zaloguj("Janko", "Jan", "Kowalski", 19, "aa1");

        System.out.println(uzytkownik.login);
        System.out.println(uzytkownikWInnymMiejscu.login);

    }







}
