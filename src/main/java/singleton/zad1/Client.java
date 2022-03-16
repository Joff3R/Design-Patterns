package singleton.zad1;

public class Client {
    public static void main(String[] args) {

        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("WATEK PIERWSZY");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("WATEK DRUGI");
            System.out.println(singleton.value);
        }
    }


}
