package template_method;

class SpecyficznaKlasaA extends KlasaAbstrakcyjna {

    @Override
    public void ZrobCos() {
        System.out.println("SpecyficznaKlasaA.ZrobCos()");
    }

    @Override
    public void JakasInnaMetoda() {
        System.out.println("SpecyficznaKlasaA.JakasInnaMetoda()");
    }
}
