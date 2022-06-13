package state;

public class Kontekst {
    private Stan _stan;

    public Kontekst(Stan stan){
        set_stan(stan);
    }

    public Stan get_stan() {
        return _stan;
    }

    public void set_stan(Stan _stan) {
        this._stan = _stan;
        System.out.println("Stan: " + _stan.getClass().getSimpleName());
    }

    public void Zapytaj(){
        get_stan().Odpowiedz(this);
    }
}
