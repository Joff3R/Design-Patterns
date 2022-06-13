package visitator;

import java.util.LinkedList;
import java.util.List;

class Struktura {
    private List<Element> elementy = new LinkedList();

    public void Dolacz(Element element){
        elementy.add(element);
    }

    public void Odlacz(Element element){
        elementy.remove(element);
    }

    public void Akceptuj(Odwiedzajacy odwiedzajacy){
        for(Element element : elementy){
            element.Akceptuj(odwiedzajacy);
        }
    }
}
