package state;

class SpecyficznyStanA extends Stan{
    @Override
    public void Odpowiedz(Kontekst kontekst) {
        kontekst.set_stan(new SpecyficznyStanB());
    }
}
