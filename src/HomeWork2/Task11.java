package HomeWork2;

public class Task11 {

    /*
        1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент
        к исполняемой программе.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    */
    public static void main(String[] args) {
        factorial(6);
    }

    public static void factorial(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
            System.out.print(i);
            if (i < n) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = ");
        System.out.print(answer);
    }
}
