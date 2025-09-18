package main.java.generics.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxElementTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 55, 3, 42);
        System.out.println(maxElement(numbers));
        // Ожидаемый вывод: 55

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println(maxElement(words));
        // Ожидаемый вывод: cherry (лексикографический порядок)

        List<Double> empty = new ArrayList<>();
        System.out.println(maxElement(empty));
        // Ожидаемый вывод: null
    }

    // Сигнатура метода (реализуй тело)
    public static <T extends Comparable<T>> T maxElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        T max = list.getFirst();
        for (T t : list) {
            if (max.compareTo(t) < 0) {
                max = t;
            }
        }
        return max;
    }
}
