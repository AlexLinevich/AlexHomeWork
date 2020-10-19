package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }

    public T[] getItems() {
        return this.data;
    }

    public T get(int index) {
        if (index >= data.length) {
            return null;
        }
        return data[index];
    }

    public boolean delete(int index) {
        if (index >= data.length) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (i > index) {
                data[i - 1] = data[i];
            }
        }
        data = Arrays.copyOf(data, data.length - 1);
        return true;
    }

    public boolean delete(T item) {
        int itemIndex;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                itemIndex = i;
                for (int j = 0; j < data.length; j++) {
                    if (j > itemIndex) {
                        data[j - 1] = data[j];
                    }
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    // public void sort(Comparator<T[]> comparator) {
    //     this.data = Arrays.sort();
    // }

    @Override
    public String toString() {
        for (int i = 0; i < data.length; i++) {
            delete(null);
        }
        return Arrays.toString(data);
    }
}
