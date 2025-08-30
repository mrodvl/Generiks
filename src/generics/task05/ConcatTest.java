package generics.task05;

import java.util.*;

public class ConcatTest {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(4, 5, 6);
        System.out.println(concat(numbers1, numbers2));
        // Ожидаемый вывод: [1, 2, 3, 4, 5, 6]

        List<String> words1 = Arrays.asList("a", "b");
        List<String> words2 = Arrays.asList("c", "d", "e");
        System.out.println(concat(words1, words2));
        // Ожидаемый вывод: [a, b, c, d, e]

        List<Double> empty1 = new ArrayList<>();
        List<Double> empty2 = new ArrayList<>();
        System.out.println(concat(empty1, empty2));
        // Ожидаемый вывод: []
    }

    // Сигнатура метода (реализуй тело)
    public static <T> List<T> concat(List<T> first, List<T> second) {
        List<T> concatList = new ArrayList<>(first);
        concatList.addAll(second);

        return concatList;
    }
}

