package HomeWork7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        printRates(new NBRBLoader());
        printRatesToFile(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader) {
        System.out.println("Сегодняшний курс за 1 EURO: " + loader.load(SiteLoader.Currency.EUR));
        System.out.println("Сегодняшний курс за 100 RUB: " + loader.load(SiteLoader.Currency.RUB));
        System.out.println("Сегодняшний курс за 1 USD: " + loader.load(SiteLoader.Currency.USD));
    }

    public static void printRatesToFile(SiteLoader loader) throws FileNotFoundException {
        String pathName = "";
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите путь к сохраняемому файлу Currency.txt: ");
        pathName = in.nextLine();
        Path path = Paths.get(pathName);
        if (Files.exists(path)) {
            pathName = pathName + "\\Currency.txt";
        } else {
            System.out.println("Папки " + pathName + " не существует");
            System.out.println("файл Currency.txt будет создан в папке HomeWork\\src\\");
            pathName = "HomeWork\\src\\Currency.txt";
        }
        try (PrintWriter out = new PrintWriter(pathName)) {
            out.println("Сегодняшний курс за 1 EURO: " + loader.load(SiteLoader.Currency.EUR));
            out.println("Сегодняшний курс за 100 RUB: " + loader.load(SiteLoader.Currency.RUB));
            out.println("Сегодняшний курс за 1 USD: " + loader.load(SiteLoader.Currency.USD));
        }
    }
}
