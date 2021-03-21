import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Words {
    public void testWords() {
        List<String> words = Arrays.asList("Гамбит", "Ладья", "Латентность", "Гамбит", "Тавтология", "Тафономия", "Регресс",
                "Резонанс", "Латентность", "Реинкорнация", "Обскуртанизм", "Оверселлинг", "Ятрогения", "Ятрогения",
                "Эвольвента", "Урбанизация", "Утилитарность", "Гендонизм");
        Set<String> unique = new HashSet<>(words);
        System.out.println("Все слова " + words);
        System.out.println("И их количство: " + words.size());
        System.out.println("Уникальные слова");
        System.out.println(unique);
        System.out.println("И их количество " + unique.size());
    }
}
