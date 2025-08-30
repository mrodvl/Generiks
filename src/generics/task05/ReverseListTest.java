package generics.task05;

import java.util.*;

public class ReverseListTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(reverse(numbers));
        // Ожидаемый вывод: [5,4,3 ,2, 1]

        List<String> words = Arrays.asList("a", "b", "c");
        System.out.println(reverse(words));
        // Ожидаемый вывод: [c, b, a]

        List<Double> empty = new ArrayList<>();
        System.out.println(reverse(empty));
        // Ожидаемый вывод: []
    }

    // Сигнатура метода (реализуй тело)
    public static <T> List<T> reverse(List<T> list) {
        List<T> reverseList = new LinkedList<>();
        for (T t : list) {
            reverseList.addFirst(t);
        }
        return reverseList;
    }
}

