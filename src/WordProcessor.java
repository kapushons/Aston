import java.util.*;

public class WordProcessor {
    public static Set<String> getWordProcessor(String[] words) {
        return new HashSet<>(Arrays.asList(words));
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }
        return wordCount;
    }
}