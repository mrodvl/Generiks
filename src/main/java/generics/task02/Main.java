package main.java.generics.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println(getLastElement(words));
        // Ожидаемый вывод: cherry

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        System.out.println(getLastElement(numbers));
        // Ожидаемый вывод: 40

        List<Double> empty = new ArrayList<>();
        System.out.println(getLastElement(empty));
        // Ожидаемый вывод: null
    }

    // Сигнатура метода (реализуй тело)
    public static <T> T getLastElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.getLast();
    }
}

