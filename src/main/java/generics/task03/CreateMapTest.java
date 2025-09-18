package main.java.generics.task03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateMapTest {
    public static void main(String[] args) {
        List<String> keys = Arrays.asList("a", "b", "c");
        List<Integer> values = Arrays.asList(1, 2, 3);

        Map<String, Integer> map = createMapFromPairs(keys, values);
        System.out.println(map);
        // Ожидаемый вывод: {a=1, b=2, c=3}

        try {
            List<String> badKeys = Arrays.asList("x", "y");
            List<Integer> badValues = Arrays.asList(10);
            createMapFromPairs(badKeys, badValues);
        } catch (IllegalArgumentException e) {
            System.out.println("Поймали исключение: " + e.getMessage());
            // Ожидаемый вывод: Поймали исключение: Размеры списков не совпадают
        }
    }

    // Сигнатура метода (реализуй тело)
    public static <K, V> Map<K, V> createMapFromPairs(List<K> keys, List<V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Error");
        }
        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;

    }
}
