package HomeWork3;

/**
 * 2. Создать класс CalculatorWithOperator.
 * 2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 2.2 В классе должны присутствовать математические методы:
 * 2.2.1 4 базовых математических метода (деления, умножение, вычитание, сложение)
 * каждый из этих методов должен принимать два параметра (определитесь с их типами)
 * и должны возвращать результать (определиться с возвращаемым типом результата)
 * при помощи ключевого слово return.
 * 2.2.2 3 метода (Возведение в степень дробного положительного числа в целую степень,
 * Модуль числа, Корень из числа (если у Вас плохо с математикой можно в этом методе воспользоваться Math)).
 * 2.3 В методах можно использовать любые арифметические операты.
 * 2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня).
 */
public class CalculatorWithOperator implements ICalculator{

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
        double result = 1;

        if (value2 == 0) {
            return result;
        } else {
            for (int i = 0; i < value2; i++) {
                result *= value1;
            }
        }
        return result;
    }

    public double absolute(double value) {
        if (value < 0) {
            return -value;
        } else {
            return value;
        }
    }

    public double mySqrt(double value) {
        return Math.sqrt(value);
    }
}


