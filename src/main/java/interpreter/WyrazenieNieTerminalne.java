package interpreter;

class WyrazenieNieTerminalne extends WyrazenieAbstrakcyjne {
    @Override
    public void Interpretuj(Kontekst kontekst) {
        System.out.println("Wywołano WyrazenieNieterminalne.Interpretuj()");
    }
}
