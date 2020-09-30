package HomeWork1;

import static java.lang.String.valueOf;

public class Task6 {
    // 6*. Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main,
    // данный метод будет принимать один параметр и будет возвращать строку
    // в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
    // Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
    // Например передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890.
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(values));
    }

    public static String createPhoneNumber(int[] values) {
        String phoneNumber = "(";
        for (int i = 0; i < values.length; ++i) {
            if (i == 3) {
                phoneNumber = phoneNumber + ") " + valueOf(values[i]);
            } else if (i == 6) {
                phoneNumber = phoneNumber + "-" + valueOf(values[i]);
            } else {
                phoneNumber = phoneNumber + valueOf(values[i]);
            }
        }
        return phoneNumber;
    }
}
