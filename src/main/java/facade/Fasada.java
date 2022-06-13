package facade;

public class Fasada {
    private final PodSystemPierwszy pierwszy;
    private final PodSystemDrugi drugi;
    private final PodSystemTrzeci trzeci;
    private final PodSystemCzwarty czwarty;

    public Fasada(){
        pierwszy = new PodSystemPierwszy();
        drugi = new PodSystemDrugi();
        trzeci = new PodSystemTrzeci();
        czwarty = new PodSystemCzwarty();
    }

    public void MetodaA(){
        System.out.println("\nMetodaA() ----");
        pierwszy.MetodaPierwsza();
        drugi.MetodaDruga();
        czwarty.MetodaCzwarta();
    }

    public void MetodaB(){
        System.out.println("\nMetodaB() ----");
        pierwszy.MetodaPierwsza();
        drugi.MetodaDruga();
        trzeci.MetodaTrzecia();
        czwarty.MetodaCzwarta();
    }


}
