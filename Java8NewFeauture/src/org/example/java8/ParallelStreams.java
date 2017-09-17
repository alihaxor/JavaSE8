package org.example.java8;

import org.example.java8.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ParallelStreams {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Robert", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));
        people.add(new Person("Bill", 63));
        people.add(new Person("Russel", 52));

        Predicate<Person> predicate = (p) -> p.getAge() > 50;
        displayPeople(people, predicate);

    }

    private static void displayPeople(List<Person> people, Predicate<Person> predicate) {
        System.out.println("Parallel Streams: ");

        // One way: calling parallelStream() method
        people.parallelStream()
                .filter(predicate)
                .forEach(p -> System.out.println(p.getInfo()));

        System.out.print("\n\n");
        // Other way: calling parallel() method.
        people.stream()
                .parallel()
                .filter(predicate)
                .forEach(p -> System.out.println(p.getInfo()));
    }
}
