package generics.task06;

import java.util.*;

public class SumNumbersTest {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumNumbers(ints));
        // Ожидаемый вывод: 15.0

        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.0);
        System.out.println(sumNumbers(doubles));
        // Ожидаемый вывод: 7.0

        List<Long> longs = Arrays.asList(100L, 200L, 300L);
        System.out.println(sumNumbers(longs));
        // Ожидаемый вывод: 600.0

        List<Float> empty = new ArrayList<>();
        System.out.println(sumNumbers(empty));
        // Ожидаемый вывод: 0.0
    }

    // Сигнатура метода (реализуй тело)
    public static double sumNumbers(List<? extends Number> list) {
        double sumNums = 0;
        for (Number n : list) {
            sumNums += n.doubleValue();
        }
        return sumNums;

    }
}

