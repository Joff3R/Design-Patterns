package visitator;

class SpecyficznyElement extends Element{
    @Override
    public void Akceptuj(Odwiedzajacy odwiedzajacy) {
        odwiedzajacy.OdwiedzSpecyficznyElement(this);
    }

    public void ZrobCos(){}
}
