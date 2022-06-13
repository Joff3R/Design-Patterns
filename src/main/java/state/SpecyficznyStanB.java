package state;

class SpecyficznyStanB extends Stan{
    @Override
    public void Odpowiedz(Kontekst kontekst) {
        kontekst.set_stan(new SpecyficznyStanA());
    }
}
