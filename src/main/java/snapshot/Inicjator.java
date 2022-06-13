package snapshot;

class Inicjator {
    private String stan;

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
        System.out.println("Stan = " + stan);
    }

    public Pamiatka UtworzPamiatke() {
        return (new Pamiatka(stan));
    }

    public void UstawPamiatke(Pamiatka pamiatka) {
        System.out.println("Przywracanie stanu...");
        setStan(pamiatka.getStan());
    }
}
