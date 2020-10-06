package HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    /*
        4.0. !!!!ВНИМАНИЕ!!!! код сортировок в данном ДЗ не должен дублироваться.
            Дублирование кода сортировок приведёт к провалу выполнения данного задания.
            Итогом выполнения данного задания будет 1 класс сортировок, и классы с main методами.
	    4.1. После каждой сортировки в консоли у вас должно получиться
	        "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
	         Для вывода можно использовать Arrays.
	    4.2. Пишем следующие алгоритмы:
		    4.2.1. Пузырьковая сортировка
		    4.2.2. Шейкерная сортировка
	    4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
		    4.3.1. {1,2,3,4,5,6}
		    4.3.2. {1,1,1,1}
		    4.3.3. {9,1,5,99,9,9}
		    4.3.4. {}
	    4.4. После тестов написать код который будет создавать массив рандомной длинны,
	        заполнять массив рандомными числами
	    4.5. После рандома написать код который будет создавать массив руками через консоль
    */
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 1, 1, 1};
        int[] array3 = {9, 1, 5, 99, 9, 9};
        int[] array4 = {};
        int[] array5 = {6, 5, 4, 3, 2, 1};
        printArrays(array1);
        printArrays(array2);
        printArrays(array3);
        printArrays(array4);
        printArrays(array5);

        int[] arrayRandom = new int[10];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = new Random().nextInt(10);
        }
        printArrays(arrayRandom);

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] arrayManual = new int[n];
        for (int i = 0; i < arrayManual.length; i++) {
            System.out.print("Ведите элемент массива № " + i + ": ");
            arrayManual[i] = in.nextInt();
        }
        printArrays(arrayManual);
    }

    private static void printArrays(int[] array) {
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив после пузырьковой сортировки:");
        System.out.println(Arrays.toString(SortArray.sortArrayBubbles(array)));
        System.out.println("Массив после шейкерной сортировки:");
        System.out.println(Arrays.toString(SortArray.sortArraysShaker(array)));
    }
}
