package HomeWork2;

import java.util.Scanner;

public class Task2 {
    /*
    2. Массивы:
	2.1 Вывести все элементы в консоль. Элементы массива вводить через консоль.
	    Массив хранит в себе числа. Выводить при помощи:
		2.1.1. do....while
		2.1.2. while
		2.1.3. for
		2.1.4. foreach.
	2.2 Вывести каждый второй элемент массива в консоль
	2.3 Вывести все элементы массива в консоль в обратном порядке.
	    Элементы массива вводить через консоль.
	    Массив хранит в себе числа. Выводить при помощи:
		2.3.1. do....while
		2.3.2. while
		2.3.3. for
		2.3.4. foreach
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ведите элемент массива № " + i + ": ");
            arr[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("Вывести все элементы массива в консоль");
        arrayPrint(arr);
        System.out.println();

        System.out.println();
        System.out.println("Вывести каждый второй элемент массива в консоль");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print("[" + i + "]: ");
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Вывести все элементы массива в консоль в обратном порядке");
        int[] tempArr = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            tempArr[j] = arr[i];
        }
        arrayPrint(tempArr);
    }

    private static void arrayPrint(int[] arr) {
        System.out.println();
        System.out.print("Массив выведен способом 1: ");
        int i = 0;
        do {
            System.out.print("[" + i + "]: ");
            System.out.print(arr[i] + "  ");
            i++;
        } while (i < arr.length);

        System.out.println();
        System.out.print("Массив выведен способом 2: ");
        i = 0;
        while (i < arr.length) {
            System.out.print("[" + i + "]: ");
            System.out.print(arr[i] + "  ");
            i++;
        }

        System.out.println();
        System.out.print("Массив выведен способом 3: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "]: ");
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.print("Массив выведен способом 4: ");
        i = 0;
        for (int values : arr) {
            System.out.print("[" + i + "]: ");
            System.out.print(values + "  ");
            i++;
        }
    }
}
