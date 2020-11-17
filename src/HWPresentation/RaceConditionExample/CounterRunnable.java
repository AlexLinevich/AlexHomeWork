package HWPresentation.RaceConditionExample;

public class CounterRunnable implements Runnable {

    private MyCounter counter;

    public CounterRunnable(MyCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            counter.increment();
        }
    }
}
