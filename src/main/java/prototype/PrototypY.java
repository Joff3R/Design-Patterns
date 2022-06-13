package prototype;

class PrototypY extends Prototyp{
    public PrototypY(String id) {
        super(id);
    }

    @Override
    public Prototyp Klonuj() {
        return new PrototypY(getId());
    }
}
