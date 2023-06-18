package StudyExample.Multithreading;

public class SynchronizedBlock2 {
    volatile static int counter = 0;
    public static synchronized void increment() { //здесь метод статичный. монитор объектазис
        // использоваться поэтому не может. в этом случае используется монитор всего класса
        counter++;
    }
    /*
    тоже самое можно описать в синхронайзд блоке

    public static void increment() {
        synchronized (SynchronizedBlock2.class){
        counter++;}
     */

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R2 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            Ex11_DataRace.increment();
        }
    }
}
