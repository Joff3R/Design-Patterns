package template_method;

abstract class KlasaAbstrakcyjna {
    public abstract void ZrobCos();

    public abstract void JakasInnaMetoda();

    public void MetodaSzablonowa() {
        ZrobCos();
        JakasInnaMetoda();
        System.out.println("");
    }
}
