package org.example.java8;

import org.example.java8.model.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Joe", 48),
                new Person("Mary", 30),
                new Person("Mike", 73)
        };

        /* // Imperative way
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getInfo());
        }*/

        /*
        // one way
        Arrays.stream(people).forEach(p -> System.out.println(p.getInfo()));
        */

        //another way
//        Stream<Person> stream = Stream.of(people);
        Stream<Person> stream = Arrays.stream(people);

        stream.forEach(person -> System.out.println(person.getInfo()));

    }
}
