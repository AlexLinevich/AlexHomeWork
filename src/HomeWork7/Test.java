package HomeWork7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        printRates(new NBRBLoader());
        printRatesToFile(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader){
        System.out.println("Сегодняшний курс за 1 EURO: " + loader.load(SiteLoader.Currency.EUR));
        System.out.println("Сегодняшний курс за 100 RUB: " + loader.load(SiteLoader.Currency.RUB));
        System.out.println("Сегодняшний курс за 1 USD: " + loader.load(SiteLoader.Currency.USD));
    }

    public static void printRatesToFile(SiteLoader loader) throws FileNotFoundException {
        String path = "HomeWork\\src\\Currency.txt";
        try(PrintWriter out = new PrintWriter(path)){
            out.println("Сегодняшний курс за 1 EURO: " + loader.load(SiteLoader.Currency.EUR));
            out.println("Сегодняшний курс за 100 RUB: " + loader.load(SiteLoader.Currency.RUB));
            out.println("Сегодняшний курс за 1 USD: " + loader.load(SiteLoader.Currency.USD));
        }
    }
}
