package HomeWork3;

/**
 * 6.3 Создать класс CalculatorWithCounterInterface и выполнить задание CalculatorWithCounter c одним исключением:
 * в данном классе будет один конструктор принимающий объект любого класса реализующего интерфейс ICalculator
 */
public class CalculatorWithCounterInterface implements ICalculator {

    private long countOperations;
    private ICalculator calculator;


    public CalculatorWithCounterInterface(ICalculator calculator) {
        this.calculator = calculator;
        countOperations++;
    }


    public double addition(double value1, double value2) {
        return calculator.addition(value1, value2);
    }

    public double subtraction(double value1, double value2) {
        return calculator.subtraction(value1, value2);
    }

    public double multiplying(double value1, double value2) {
        return calculator.multiplying(value1, value2);
    }

    public double dividing(double value1, double value2) {
        return calculator.dividing(value1, value2);
    }

    public double myPow(double value1, int value2) {
        return calculator.myPow(value1, value2);
    }

    public double absolute(double value) {
        return calculator.absolute(value);
    }

    public double mySqrt(double value) {
        return calculator.mySqrt(value);
    }

    public long getCountOperations() {
        return countOperations;
    }
}
