package HomeWork3;

/**
 * 1. Создать класс WithOutCalculatorMain в котором небходимо посчитать следующие выражения:
 * 1.1) 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.
 * Внимание, знак "^" обозначает возведение в степень.
 */
public class WithOutCalculatorMain {

    public static void main(String[] args) {
        double result;
        result = 4.1 + 15 * 7 + Math.pow(((double) 28 / 5), 2);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
