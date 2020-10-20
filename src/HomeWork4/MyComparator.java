package HomeWork4;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return (Integer) o1 - (Integer) o2;
    }
}
