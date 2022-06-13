package prototype;

public class Main {

    public static void main(String[] args) {
        PrototypY prototyp1 = new PrototypY("I");
        PrototypY klon1 = (PrototypY) prototyp1.Klonuj();
        System.out.println("Sklonowano %s".formatted(klon1.getId()));

        PrototypX prototyp2 = new PrototypX("II");
        PrototypX klon2 = (PrototypX) prototyp2.Klonuj();
        System.out.println("Sklonowano: %s".formatted(klon2.getId()));
    }
}
