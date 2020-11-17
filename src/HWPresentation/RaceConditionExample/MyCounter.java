package HWPresentation.RaceConditionExample;

public class MyCounter {

    private int c = 0;

    public /* synchronized */ void increment() {
        c++;
    }

    public int getValue() {
        return c;
    }
}
