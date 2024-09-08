import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "Сом", "Карась", "Щука", "Сом", "Подлещик",
                "Карась", "Уклейка", "Ротан", "Карп", "Картп",
                "Форель", "Карась", "Карп", "Сом", "Щука", "Подлещик", "Сом", "Сом"
        };

        Set<String> uniqueWords = WordProcessor.getWordProcessor(words);
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = WordProcessor.countWords(words);
        System.out.println("Сколько раз встречается каждое слово:");
        for (Map.Entry<?, ?> entry : ((Map<?, ?>) wordCount).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сорокин", "777 777");
        phoneBook.add("Петров", "666 666");
        phoneBook.add("Емельянов", "444 444");
        phoneBook.add("Рахманин", "000 999");
        phoneBook.add("Сорокин", "111 111");

        System.out.println("Сорокин: " + phoneBook.get("Сорокин"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Емельянов: " + phoneBook.get("Емельянов"));
        System.out.println("Рахманин:" + phoneBook.get("Рахманин"));
    }
}
