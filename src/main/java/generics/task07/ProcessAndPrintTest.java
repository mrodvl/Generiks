package main.java.generics.task07;

import java.util.*;
import java.util.function.*;

public class ProcessAndPrintTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        // Consumer для Number (суперкласс Integer)
        Consumer<Number> printDouble = n -> System.out.println(n.doubleValue() * 2);

        processAndPrint(numbers, printDouble);
        // Ожидаемый вывод:
        // 2.0
        // 4.0
        // 6.0

        List<String> words = Arrays.asList("a", "bb", "ccc");
        Consumer<Object> printLength = o -> System.out.println(o.toString().length());

        processAndPrint(words, printLength);
        // Ожидаемый вывод:
        // 1
        // 2
        // 3
    }

    // Сигнатура метода (реализуй тело)
    public static <T> void processAndPrint(List<T> data, Consumer<? super T> action) {
        // TODO: твоя реализация
        //data.forEach(action);
        for (T datum : data) {
            action.accept(datum);
        }
    }
}

