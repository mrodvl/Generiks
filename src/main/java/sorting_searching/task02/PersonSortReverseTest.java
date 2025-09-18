package main.java.sorting_searching.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonSortReverseTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Bob", 25),
                new Person("Alice", 30),
                new Person("Charlie", 30),
                new Person("Alice", 25),
                new Person("Bob", 40)
        ));

        // 1. По имени (ASC), затем по возрасту (DESC)
        people.sort(Comparator.comparing(Person::name)
                .thenComparing(Comparator.comparingInt((Person person) -> person.age()).reversed()));
        System.out.println("По имени ASC, возраст DESC: \n" + people +"\n");
        // [Alice(30), Alice(25), Bob(40), Bob(25), Charlie(30)]

//         2. По возрасту (DESC), затем по имени (ASC)
        people.sort(Comparator.comparing(Person::age).reversed().thenComparing(Person::name));
        System.out.println("По возрасту DESC, имя ASC: \n" + people);
        // [Bob(40), Alice(30), Charlie(30), Alice(25), Bob(25)]
    }
}

