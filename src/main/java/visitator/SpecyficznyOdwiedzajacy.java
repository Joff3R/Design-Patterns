package visitator;

class SpecyficznyOdwiedzajacy extends Odwiedzajacy{
    @Override
    public void OdwiedzSpecyficznyElement(SpecyficznyElement specyficznyElement) {
        System.out.println("%s odwiedzony przez %s".formatted(specyficznyElement.getClass().getSimpleName(),this.getClass().getSimpleName()));
    }

    @Override
    public void OdwiedzInnySpecyficznyElement(InnySpecyficznyElement innySpecyficznyElement) {
        System.out.println("%s odwiedzony przez %s".formatted(innySpecyficznyElement.getClass().getSimpleName(),this.getClass().getSimpleName()));
    }
}
