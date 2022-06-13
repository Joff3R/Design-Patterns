package composite;

import java.util.LinkedList;
import java.util.List;

public class Kompozyt extends Element {
    private List<Element> dzieci = new LinkedList<>();

    public Kompozyt(String nazwa) {
        super(nazwa);
    }

    @Override
    public void Dodaj(Element element) {
        dzieci.add(element);
    }

    @Override
    public void Usun(Element element) {
        dzieci.remove(element);
    }

    @Override
    public void Pokaz(int poziom) {
        System.out.println("-".repeat(poziom) + nazwa);

        for (Element element : dzieci) {
            element.Pokaz(poziom + 2);
        }
    }
}
