package HomeWork3;

/**
 * 7*. Создать CalculatorWithMemory.
 * 7.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и
 * обеспечить его дополнительной функцией памяти.
 * В принципе работает как калькулятор из реальной жизни.
 * 7.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 7.3 Данный класс напрямую не умеет считать математику.
 * 7.4 В классе должны присутствовать математические методы:
 * 7.4.1 4 базовых математических метода (деления, умножение, вычитание, сложение).
 * 7.4.2 3 метода (Возведение в степень дробного положительного числа в целую степень, Модуль числа, Корень из числа).
 * 7.5 Функция памяти работает через методы:
 * 7.5.1 Записать в память результат выполнения последнего вызванного метода
 * 7.5.2 Получить из памяти записанное значение. При получении записи из памяти память стирается,
 * при записи нового значения память перезаписывается.
 */
public class CalculatorWithMemory {

    private long countOperations = 0;
    private double memory;
    private CalculatorWithOperator calculator;
    private CalculatorWithMathCopy calculator1;
    private CalculatorWithMathExtends calculator2;

    public CalculatorWithMemory(CalculatorWithOperator calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithMemory(CalculatorWithMathCopy calculator) {
        this.calculator1 = calculator;
    }

    public CalculatorWithMemory(CalculatorWithMathExtends calculator) {
        this.calculator2 = calculator;
    }

    public double addition(double value1, double value2) {
        countOperations++;
        setMemory(calculator.addition(value1, value2));
        return calculator.addition(value1, value2);
    }

    public double subtraction(double value1, double value2) {
        countOperations++;
        setMemory(calculator.subtraction(value1, value2));
        return calculator.subtraction(value1, value2);
    }

    public double multiplying(double value1, double value2) {
        countOperations++;
        setMemory(calculator.multiplying(value1, value2));
        return calculator.multiplying(value1, value2);
    }

    public double dividing(double value1, double value2) {
        countOperations++;
        setMemory(calculator.dividing(value1, value2));
        return calculator.dividing(value1, value2);
    }

    public double myPow(double value1, int value2) {
        countOperations++;
        setMemory(calculator.myPow(value1, value2));
        return calculator.myPow(value1, value2);
    }

    public double absolute(double value) {
        countOperations++;
        setMemory(calculator.absolute(value));
        return calculator.absolute(value);
    }

    public double mySqrt(double value) {
        countOperations++;
        setMemory(calculator.mySqrt(value));
        return calculator.mySqrt(value);
    }

    public long getCountOperations() {
        return countOperations;
    }

    public double getMemory() {
        double tempMemory = memory;
        memory = 0;
        return tempMemory;

    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

}
