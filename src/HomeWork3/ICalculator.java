package HomeWork3;

/**
 * 6*. Создать интерфейс ICalculator.
 * 6.1 В данном интерфейсе должны быть объявлены методы:
 * 6.1.1 4 базовых математических метода (деления, умножение, вычитание, сложение).
 * 6.1.2 3 метода (Возведение в степень дробного положительного числа в целую степень,
 * Модуль числа, Корень из числа).
 * 6.2 Данный интерфейс должен быть прописан во всех классах (implements ICalculator)
 */
public interface ICalculator {

    double addition(double value1, double value2);

    double subtraction(double value1, double value2);

    double multiplying(double value1, double value2);

    double dividing(double value1, double value2);

    double myPow(double value1, int value2);

    double absolute(double value);

    double mySqrt(double value);
}
