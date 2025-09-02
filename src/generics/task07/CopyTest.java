package generics.task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyTest {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Number> numbers = new ArrayList<>();

        copy(ints, numbers);
        System.out.println(numbers);
        // Ожидаемый вывод: [1, 2, 3]

        List<Double> doubles = Arrays.asList(1.5, 2.5);
        List<Object> objects = new ArrayList<>();

        copy(doubles, objects);
        System.out.println(objects);
        // Ожидаемый вывод: [1.5, 2.5]
    }

    // Сигнатура метода (реализуй тело)
    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        /*
        for (T t : src) {
            dest.add(t);
        }
        */
        dest.addAll(src);
    }
}
