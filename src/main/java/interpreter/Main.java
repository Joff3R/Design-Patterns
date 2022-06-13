package interpreter;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kontekst kontekst = new Kontekst();

        List<WyrazenieAbstrakcyjne> wyrazenia = new LinkedList();

        wyrazenia.add(new WyrazenieTerminalne());
        wyrazenia.add(new WyrazenieNieTerminalne());
        wyrazenia.add(new WyrazenieTerminalne());
        wyrazenia.add(new WyrazenieTerminalne());

        for (WyrazenieAbstrakcyjne wyrazenieAbstrakcyjne : wyrazenia) {
            wyrazenieAbstrakcyjne.Interpretuj(kontekst);
        }
    }
}
