package HomeWork2;

public class Task12 {

    /*
        1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить
        между собой и вывести ход вычислений в консоль.
        Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * …. * 5 = ответ
    */
    public static void main(String[] args) {
        multiplyAndPrint(181232375);
    }

    public static void multiplyAndPrint(int n) {
        int value = n;
        int answer = 1;
        while (value > 0) {
            int varValue = value;
            int i = 1;
            while (varValue >= 10) {
                varValue = varValue / 10;
                i *= 10;
            }
            answer *= varValue;
            value = value - varValue * i;
            System.out.print(varValue);
            if (value > 0) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = ");
        System.out.print(answer);
    }
}
