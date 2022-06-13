package observer;

class SpecyficznyObserwator extends Obserwator{
    private String _nazwa;
    private String _obserwatorStan;
    public SpecyficznyObserwowany Obserwowany;

    public SpecyficznyObserwowany getObserwowany() {
        return Obserwowany;
    }

    public void setObserwowany(SpecyficznyObserwowany obserwowany) {
        Obserwowany = obserwowany;
    }

    public SpecyficznyObserwator(SpecyficznyObserwowany obserwowany, String nazwa){
        this.setObserwowany(obserwowany);
        this._nazwa = nazwa;
    }

    @Override
    public void Aktualizuj() {
        _obserwatorStan = getObserwowany().getStanObserwowanego();
        System.out.println("Obserwator %s ma nowy stan o wartości: %s".formatted(_nazwa,_obserwatorStan));
    }
}
