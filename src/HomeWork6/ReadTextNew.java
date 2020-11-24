package HomeWork6;

import HomeWork5.EasySearch;
import HomeWork5.ISearchEngine;
import HomeWork5.RegExSearch;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.*;

public class ReadTextNew {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

        FileInputStream inFile = new FileInputStream("HomeWork\\src\\Война и мир_книга.txt");
        byte[] str = new byte[inFile.available()];
        inFile.read(str);
        String text = new String(str);

        int numberParts = 4;
        String[] dividedText = new String[numberParts];
        int temp = text.length() / numberParts;
        int temp1 = 0;
        int temp2 = temp;
        for (int i = 0; i < numberParts - 1; i++) {
            dividedText[i] = text.substring(temp1, temp2);
            temp1 = temp2 + 1;
            temp2 = temp * (i + 2);
        }
        dividedText[numberParts - 1] = text.substring(temp1, text.length() - 1);

        String word1 = "война";
        String word2 = " и ";
        String word3 = "мир";

        ISearchEngine Search1 = new EasySearch();

        ExecutorService threadPool = Executors.newFixedThreadPool(numberParts);

        Future<Integer> future1 = threadPool.submit(() -> {
            int result = 0;
            for (int i = 0; i < numberParts; i++) {
                result += Search1.search(dividedText[i].toLowerCase(), word1);
            }
            return result;
        });
        Future<Integer> future2 = threadPool.submit(() -> {
            int result = 0;
            for (int i = 0; i < numberParts; i++) {
                result += Search1.search(dividedText[i].toLowerCase(), word2);
            }
            return result;
        });
        Future<Integer> future3 = threadPool.submit(() -> {
            int result = 0;
            for (int i = 0; i < numberParts; i++) {
                result += Search1.search(dividedText[i].toLowerCase(), word3);
            }
            return result;
        });

        System.out.println("Слово \"" + word1 + "\" встречается в тексте в количестве: " + future1.get());
        System.out.println("Слово \"" + word2 + "\" встречается в тексте в количестве: " + future2.get());
        System.out.println("Слово \"" + word3 + "\" встречается в тексте в количестве: " + future3.get());
        System.out.println();
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);

        ISearchEngine Search2 = new RegExSearch();
        System.out.println("Слово \"" + word1 + "\" встречается в тексте в количестве: " + Search2.search(text.toLowerCase(), word1));
        System.out.println("Слово \"" + word2 + "\" встречается в тексте в количестве: " + Search2.search(text.toLowerCase(), word2));
        System.out.println("Слово \"" + word3 + "\" встречается в тексте в количестве: " + Search2.search(text.toLowerCase(), word3));
    }
}
