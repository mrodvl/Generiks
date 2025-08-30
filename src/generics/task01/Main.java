package generics.task01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
//    public static void main(String[] args) {
//        List<String> input = Arrays.asList(
//                "apple", "banana", "apple", "orange", "banana", "apple"
//        );
//
//        Map<String, Integer> result = countWords(input);
//
//        System.out.println(result);
//    }
//
//    public static Map<String, Integer> countWords(List<String> words) {
//        Map<String, Integer> result = new TreeMap<>();
//        for (String word : words) {
//            result.compute(word, (k, v) -> {
//                if (v == null) {
//                    return 1;
//                } else {
//                    return v + 1;
//                }
//            });
//        }
//        return result;
//    }

public static void main(String[] args) {
    List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "apple"
    );

    List<String> toRemove = Arrays.asList("apple", "banana", "orange");
    Map<String, Integer> result = removeWordsOnce(words, toRemove);

    System.out.println(result);
    // Ожидаемый вывод: {apple=2, banana=1}
}

    // Сигнатура метода (реализуй тело)
    public static Map<String, Integer> removeWordsOnce(List<String> words, List<String> toRemove) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
           result.compute(word,(k,v) -> v == null ? 1 : v + 1);

        }
        for (String word : toRemove) {
            result.compute(word,(k,v) -> {
                if (v == null) {
                    return v;
                }
                int newV = v - 1;
                if (newV == 0) {
                    return null;
                }
                return newV;
            });
        }
        return result;
    }
}
