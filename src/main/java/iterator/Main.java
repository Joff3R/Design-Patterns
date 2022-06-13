package iterator;

public class Main {

    public static void main(String[] args) {
        SpecyficznyKontener kontenter = new SpecyficznyKontener();
        kontenter.set(0,"Element A");
        kontenter.set(1,"Element B");
        kontenter.set(2,"Element C");
        kontenter.set(3,"Element D");

        Iterator iterator = kontenter.StworzIterator();

        System.out.println("Iteracja kolekcji:");

        Object element = iterator.Pierwszy();
        while (element != null)
        {
            System.out.println(element.toString());
            element = iterator.Nastepny();
        }
    }
}
