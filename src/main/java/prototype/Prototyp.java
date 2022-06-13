package prototype;

abstract class Prototyp {
    public String id;

    public String getId() {
        return id;
    }
    public Prototyp(String id){
        this.id = id;
    }

    public  abstract  Prototyp Klonuj();

}
