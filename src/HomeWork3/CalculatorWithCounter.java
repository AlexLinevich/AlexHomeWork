package HomeWork3;

/**
 * 5*. Создать класс CalculatorWithCounter.
 * 5.1 Данный класс предназначен для того чтобы подсчитывать количество использований калькулятора.
 * 5.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 5.3 Данный класс напрямую не умеет считать математику
 * 5.4 В данном классе должены быть следующие варианты конструктора:
 * 5.4.1 Принимающий объект класса CalculatorWithOperator
 * 5.4.2 Принимаюший объект класса CalculatorWithMathCopy
 * 5.4.3 Принимающий объект класса CalculatorWithMathExtends
 * 5.4 В классе должны присутствовать математические методы:
 * 5.5.1 4 базовых математических метода (деления, умножение, вычитание, сложение).
 * 5.5.2 3 метода (Возведение в степень дробного положительного числа в целую степень, Модуль числа, Корень из числа).
 * 5.5 В классе должен быть метод long getCountOperation() который должен возвращать количество
 * использований данного калькулятора.
 */
public class CalculatorWithCounter {

    private long countOperations;
    private CalculatorWithOperator calculator;
    private CalculatorWithMathCopy calculator1;
    private CalculatorWithMathExtends calculator2;

    public CalculatorWithCounter(CalculatorWithOperator calculator) {
        this.calculator = calculator;
        countOperations++;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator) {
        this.calculator1 = calculator;
        countOperations++;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator) {
        this.calculator2 = calculator;
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
