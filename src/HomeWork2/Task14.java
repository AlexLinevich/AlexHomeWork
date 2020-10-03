package HomeWork2;

public class Task14 {

    /*
        1.4.* Умножать число long a = 1; на 3 пока не произойдёт переполнение.
        В конце в консоль вывести сообщение со значением до переполнения и после переполнения.
    */
    public static void main(String[] args) {
        long a = 1;
        long b = 3;
        long c;
        for (; ; ) {
            c = a;
            a = a * b;
            if (a / c != b) {
                break;
            }
        }
        System.out.println("Значение до переполнения: " + c);
        System.out.println("Значение после переполнения: " + a);
    }
}
