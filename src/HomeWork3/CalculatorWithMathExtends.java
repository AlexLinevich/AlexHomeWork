package HomeWork3;

/**
 * 4. Создать класс CalculatorWithMathExtends.
 * 4.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 4.2 Данный класс должен наследовать класс CalculatorWithOperator.
 * 4.3 В классе должны присутствовать
 * 4.3.1 4 базовых математических метода (деления, умножение, вычитание, сложение)
 * НЕ ДОЛЖНЫ быть объявлены в классе, а должны быть унаследованы от родительского класса.
 * 4.3.2 3 метода (Возведение в степень дробного положительного числа в целую степень,
 * Модуль числа, Корень из числа).
 * Данные методы должны ПЕРЕОПРЕДЕЛЯТЬ методы родительского класса и должны содержать
 * в своём теле вызов библиотеки Math и возврат полученного результата .
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double myPow(double value1, int value2) {
        return Math.pow(value1, value2);
    }

    @Override
    public double absolute(double value) {
        return Math.abs(value);
    }

    @Override
    public double mySqrt(double value) {
        return Math.sqrt(value);
    }
}
