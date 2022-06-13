package factory.zad1;

import factory.zad1.fabryki.Fabryka;
import factory.zad1.fabryki.JednostkaFabryka;

import static factory.zad1.JednostkaTyp.*;

public class Client {

    public static void main(String[] args) {

        Fabryka fabryka = new JednostkaFabryka();

        Jednostka czolg = fabryka.stworzJednostke(CZOLG);
        Jednostka strzelec = fabryka.stworzJednostke(STRZELEC);

        System.out.println(czolg.zycie);
        System.out.println(strzelec.silaZniszczen);

    }
}
