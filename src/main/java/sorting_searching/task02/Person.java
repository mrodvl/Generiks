package main.java.sorting_searching.task02;

public record Person(String name, int age) implements Comparable<Person> {
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);

    }

}
