package visitator;

class InnySpecyficznyElement extends Element{
    @Override
    public void Akceptuj(Odwiedzajacy odwiedzajacy) {
        odwiedzajacy.OdwiedzInnySpecyficznyElement(this);
    }

    public void ZrobCos(){}
}
