package HomeWork3;

/**
 * 3. Создать класс CalculatorWithMathCopy.
 * 3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 3.2 В классе должны присутствовать математические методы:
 * 3.2.1 4 базовых математических метода (деления, умножение, вычитание, сложение).
 * Скопировать базовые математические операции из CalculatorWithOperator.
 * 3.2.2 3 метода (Возведение в степень дробного положительного числа в целую степень,
 * Модуль числа, Корень из числа).
 * Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 */
public class CalculatorWithMathCopy {

    public double addition(double value1, double value2) {
        return value1 + value2;
    }

    public double subtraction(double value1, double value2) {
        return value1 - value2;
    }

    public double multiplying(double value1, double value2) {
        return value1 * value2;
    }

    public double dividing(double value1, double value2) {
        return value1 / value2;
    }

    public double myPow(double value1, int value2) {
        return Math.pow(value1, value2);
    }

    public double absolute(double value) {
        return Math.abs(value);
    }

    public double mySqrt(double value) {
        return Math.sqrt(value);
    }
}


