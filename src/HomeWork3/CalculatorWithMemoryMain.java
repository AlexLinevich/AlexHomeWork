package HomeWork3;

/**
 * 7.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод).
 * В main методе требуется создать экземпляр калькулятора и используя методы
 * из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 * В мэйне запрещается использование переменных для хранения значений участвующих в просчёте,
 * а также результатов работы методов калькулятора.
 */
public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        calculator.dividing(28, 5);
        calculator.myPow(calculator.getMemory(), 2);
        calculator.addition(calculator.getMemory(), 4.1);
        calculator.addition(calculator.getMemory(), calculator.multiplying(15,7));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calculator.getMemory());
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperations());
    }
}
