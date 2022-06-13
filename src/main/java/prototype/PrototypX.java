package prototype;

class PrototypX extends Prototyp{
    public PrototypX(String id) {
        super(id);
    }

    @Override
    public Prototyp Klonuj() {
        return new PrototypX(getId());
    }
}
