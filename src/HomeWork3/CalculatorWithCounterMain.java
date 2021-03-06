package HomeWork3;

/**
 * 5.6 Создать класс CalculatorWithCounterMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы из данного
 * экземпляра посчитать выражения из задания 1.
 * Вывести в консоль результат.
 */
public class CalculatorWithCounterMain {

    public static void main(String[] args) {

        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithOperator());

        double result1 = calculator.multiplying(15, 7);
        double result2 = calculator.dividing(28, 5);
        double result3 = calculator.myPow(result2, 2);
        double result4 = calculator.addition(result3, result1);
        double result = calculator.addition(result4, 4.1);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperations());
    }
}
