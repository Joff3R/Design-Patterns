package observer;

public class Main {

    public static void main(String[] args) {
        SpecyficznyObserwowany s = new SpecyficznyObserwowany();
        s.DolaczObserwatora(new SpecyficznyObserwator(s,"X"));
        s.DolaczObserwatora(new SpecyficznyObserwator(s,"Y"));
        s.DolaczObserwatora(new SpecyficznyObserwator(s,"Z"));

        s.StanObserwowanego = "ABC";
        s.Powiadom();
    }
}
