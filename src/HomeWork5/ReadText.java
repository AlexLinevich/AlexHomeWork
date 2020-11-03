package HomeWork5;

import java.io.*;
import java.util.*;
import java.util.List;

public class ReadText {

    private static List<String> listData = new ArrayList<>();
    private static Map<String, Integer> mapData = new HashMap<>();

    public static void main(String[] args) throws IOException {

        File file = new File("HomeWork\\src\\Война и мир_книга.txt");
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String readLine = in.readLine();
            while (readLine != null) {
                seekWords(readLine);
                readLine = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Set<String> setData = new HashSet<>(listData);

        for (String setDatum : setData) {
            int counter = 0;
            for (String listDatum : listData) {
                if (setDatum.equals(listDatum)) {
                    ++counter;
                }
            }
            mapData.put(setDatum, counter);
        }
        /*
         * Не знаю как отсортировать колекцию Map по значению (нашел работающий код, но не знаю точно как он работает)
         * и не знаю как проитерировать для печати только 10 первых элементов
         */

        mapData.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

        //  for (Map.Entry<String, Integer> entry : mapData.entrySet()) {
        //  System.out.println(entry.getKey() + " - " + entry.getValue());

        FileInputStream inFile = new FileInputStream("HomeWork\\src\\Война и мир_книга.txt");
        byte[] str = new byte[inFile.available()];
        inFile.read(str);
        String text = new String(str);
        text = text.toLowerCase();

        String word1 = "война";
        String word2 = " и ";
        String word3 = "мир";

        ISearchEngine Search1 = new EasySearch();
        System.out.println("Слово \"" + word1 + "\" встречается в тексте в количестве: " + Search1.search(text, word1));
        System.out.println("Слово \"" + word2 + "\" встречается в тексте в количестве: " + Search1.search(text, word2));
        System.out.println("Слово \"" + word3 + "\" встречается в тексте в количестве: " + Search1.search(text, word3));
        System.out.println();

        ISearchEngine Search2 = new RegExSearch();
        System.out.println("Слово \"" + word1 + "\" встречается в тексте в количестве: " + Search2.search(text, word1));
        System.out.println("Слово \"" + word2 + "\" встречается в тексте в количестве: " + Search2.search(text, word2));
        System.out.println("Слово \"" + word3 + "\" встречается в тексте в количестве: " + Search2.search(text, word3));
    }


    public static void seekWords(String line) {
        if (!line.equals("")) {
            String[] s = line.split(" +");
            for (String s1 : s) {
                if (!s1.equals("")) {
                    while (s1.charAt(0) == '"' || s1.charAt(0) == '-'
                            || s1.charAt(0) == '(') {
                        if (s1.length() > 1) {
                            s1 = s1.substring(1);
                        } else s1 = " ";
                    }
                    while (s1.charAt(s1.length() - 1) == '"' || s1.charAt(s1.length() - 1) == '!'
                            || s1.charAt(s1.length() - 1) == '?' || s1.charAt(s1.length() - 1) == ')'
                            || s1.charAt(s1.length() - 1) == ':' || s1.charAt(s1.length() - 1) == ';'
                            || s1.charAt(s1.length() - 1) == '.' || s1.charAt(s1.length() - 1) == ',') {
                        s1 = s1.substring(0, (s1.length() - 1));
                    }
                    if (!s1.equals(" ")) {
                        listData.add(s1);
                    }
                }
            }
        }
    }
}
