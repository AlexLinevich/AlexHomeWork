package HomeWork1;

import java.util.Scanner;

public class Task53 {

    // 1. Если имя будет равно имени Вася тогда в консоль должно вывести сообщение
    // "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
    // 2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести
    // сообщение "Я тебя так долго ждал".
    // 3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
