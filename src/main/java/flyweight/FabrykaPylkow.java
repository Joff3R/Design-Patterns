package flyweight;

import java.util.HashMap;

public class FabrykaPylkow {
    private HashMap<String, Pylek> pylki = new HashMap<>();

    public FabrykaPylkow(){
        pylki.put("Q", new SpecyficznyPylek());
        pylki.put("W", new SpecyficznyPylek());
        pylki.put("E", new SpecyficznyPylek());
    }

    public Pylek GetPylek(String key){
        return pylki.get(key);
    }
}
