package sorting_searching.lesson3;

import sorting_searching.task02.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Bob", 25),
                new Person("Alice", 30),
                new Person("Charlie", 30),
                new Person("Alice", 25),
                new Person("Bob", 40)
        ));

        people.sort(Comparator.comparing(Person::name));
        System.out.println(people);

        int index = Collections.binarySearch(people, new Person("Bob", 0)
                , Comparator.comparing(Person::name));
        System.out.println(index);
    }
}
