package HWPresentation.RaceConditionExample;

public class CounterTest {

    public static void main(String[] args) throws InterruptedException {

        MyCounter counter = new MyCounter();

        Thread thread1 = new Thread(new CounterRunnable(counter));
        Thread thread2 = new Thread(new CounterRunnable(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getValue());
    }
}
