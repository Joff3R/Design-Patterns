package interpreter;

class WyrazenieTerminalne extends WyrazenieAbstrakcyjne {
    @Override
    public void Interpretuj(Kontekst kontekst) {
        System.out.println("Wywołano WyrazenieTerminalne.Interpretuj()");
    }
}
