package HomeWork5;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long counter = 0;
        int index = 0;
        int nextIndex = text.indexOf(word, index);
        while ( nextIndex!= -1){
            index = nextIndex + 1;
            nextIndex = text.indexOf(word, index);
            counter++;
        }
        return counter;
    }
}
