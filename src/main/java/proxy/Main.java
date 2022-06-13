package proxy;

public class Main {

    public static void main(String[] args) {
        Pelnomocnik pelnomocnik = new Pelnomocnik("zlehaslo");
        System.out.println(pelnomocnik.PobierzDane());

        Pelnomocnik pelnomocnik2 = new Pelnomocnik("dobrehaslo");
        System.out.println(pelnomocnik2.PobierzDane());
    }
}
