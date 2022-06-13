package observer;

import java.util.LinkedList;
import java.util.List;

abstract class Obserwowany {
    private List<Obserwator> _obserwatorzy = new LinkedList<Obserwator>();

    public void DolaczObserwatora(Obserwator obserwator){
        _obserwatorzy.add(obserwator);
    }

    public void OdlaczObserwatora(Obserwator obserwator){
        _obserwatorzy.remove(obserwator);
    }

    public void Powiadom(){
        for (Obserwator o : _obserwatorzy){
            o.Aktualizuj();
        }
    }
}
