package HomeWork5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long counter = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            ++counter;
        }
        return counter;
    }
}
