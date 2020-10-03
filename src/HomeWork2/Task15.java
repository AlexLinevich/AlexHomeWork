package HomeWork2;

public class Task15 {

    /*
        1.5. Вывести таблицу умножения в консоль.
        В консоли должно получиться также как и на картинке.
    */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                int c = j * i;
                System.out.print(j + " x " + i);
                if (i == 10) {
                    System.out.print("= ");
                } else System.out.print(" = ");
                if (c < 10) {
                    System.out.print(" " + c);
                } else System.out.print(c);
                if (j < 5) {
                    System.out.print("   |   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                int c = j * i;
                System.out.print(j + " x " + i);
                if (i == 10) {
                    System.out.print("= ");
                } else System.out.print(" = ");
                if (c < 10) {
                    System.out.print(" " + c);
                } else System.out.print(c);
                if (j < 9) {
                    System.out.print("   |   ");
                }
            }
            System.out.println();
        }
    }
}
