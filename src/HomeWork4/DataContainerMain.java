package HomeWork4;

import java.util.Arrays;

public class DataContainerMain {

    public static void main(String[] args) {

        int index;

        Integer[] data = new Integer[]{1, 2, 3, null, null, null};
        DataContainer<Integer> dS = new DataContainer<>(data);

        System.out.println("Исходный массив: " + Arrays.toString(data));
        index = dS.add(777);
        System.out.println("Добавлено под номером: " + index);
        index = dS.add(55);
        System.out.println("Добавлено под номером: " + index);
        System.out.println("Новый массив: " + Arrays.toString(dS.getItems()));
        System.out.println("Объект под номером " + index + ": " + dS.get(index));

        Integer[] data1 = new Integer[]{};
        DataContainer<Integer> ds1 = new DataContainer<>(data1);

        index = ds1.add(9999);
        System.out.println("Новый массив: " + Arrays.toString(ds1.getItems()));
        System.out.println("Объект под номером " + index + ": " + ds1.get(index));
        System.out.println("Объект под номером " + 1 + ": " + ds1.get(1));

        Integer[] data2 = new Integer[]{1, 2, null, 3, 777};
        DataContainer<Integer> ds2 = new DataContainer<>(data2);
        System.out.println("Исходный массив: " + Arrays.toString(data2));
        index = 2;
        System.out.println("Результат удаления объекта с индексом " + index + ": " + ds2.delete(index));
        System.out.println("Новый массив: " + Arrays.toString(ds2.getItems()));

        Integer[] data3 = new Integer[]{1, 2, null, 3, null, 777, 3, null, null, 5};
        DataContainer<Integer> ds3 = new DataContainer<>(data3);
        System.out.println("Исходный массив: " + Arrays.toString(data3));
        Integer item = 3;
        System.out.println("Результат удаления объекта " + item + ": " + ds3.delete(item));
        System.out.println("Новый массив: " + Arrays.toString(ds3.getItems()));
        System.out.println(ds3.toString());

        ds3.sort(new MyComparator<>());
        System.out.println("Новый массив после сортировки: " + Arrays.toString(ds3.getItems()));
    }
}
