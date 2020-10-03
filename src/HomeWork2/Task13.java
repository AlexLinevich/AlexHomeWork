package HomeWork2;

import java.util.Scanner;

public class Task13 {

    /*
        1.3. Возведение в степень. Через консоль пользователь вводит два числа.
        Первое число это число которое мы будем возводить, Второе число это
        степень в которую возводят первое число.
        Степень - только положительная и целая.
        Возводимое число - может быть отрицательным и дробным.
        Math использовать нельзя.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите возводимое в степень число (может быть отрицательным и дробным): ");
        double a = in.nextDouble();
        System.out.print("Введите степень (только положительная и целая): ");
        int n = in.nextInt();
        System.out.println(a + " в степени " + n + " равняется " + degree(a, n));
    }

    public static double degree(double value1, int value2) {
        double answer = value1;
        if (value2 == 0) {
            answer = 1;
            return answer;
        }
        for (int i = 1; i < value2; i++) {
            answer *= value1;
        }
        return answer;
    }
}
