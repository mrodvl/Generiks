package sorting_searching.task01;

import java.util.*;

public class Main {

//    record Employee(UUID id, String name, double salary) { }
//
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee(UUID.randomUUID(), "name1", 100),
//                new Employee(UUID.randomUUID(), "name3", 100),
//                new Employee(UUID.randomUUID(), "name4", 500),
//                new Employee(UUID.randomUUID(), "name2", 100)
//        );
//
//        employees.sort(Comparator.comparing(Employee::salary).thenComparing(Employee::name));
//        System.out.println(employees);
//    }
    record Person(String name,int age) implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}

    static class PersonNameComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        ));

        // 1. Сортировка по возрасту (естественный порядок)
        Collections.sort(people);
        System.out.println("По возрасту: " + people);
        // Ожидаемый вывод: [Bob(25), Alice(30), Charlie(35)]

        // 2. Сортировка по имени (Comparator)
        Collections.sort(people, new PersonNameComparator());
        System.out.println("По имени: " + people);
        // Ожидаемый вывод: [Alice(30), Bob(25), Charlie(35)]

        // 3. Сортировка массива
        Person[] arr = {
                new Person("Eve", 28),
                new Person("Dave", 40)
        };
        Arrays.sort(arr);
        System.out.println("Массив по возрасту: " + Arrays.toString(arr));
        // Ожидаемый вывод: [Eve(28), Dave(40)]

        Arrays.sort(arr, new PersonNameComparator());
        System.out.println("Array by name: " + Arrays.toString(arr));
    }
}
