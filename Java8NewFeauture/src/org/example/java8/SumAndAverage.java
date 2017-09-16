package org.example.java8;

import org.example.java8.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jon", 48));
        people.add(new Person("Marry", 30));
        people.add(new Person("Mike", 73));

        int sum = people.stream()
                .mapToInt(p -> p.getAge()).sum();

        System.out.println("Total of ages: " + sum);

        OptionalDouble avg = people.stream()
                .mapToInt(p -> p.getAge())
                .average();

        if (avg.isPresent()) {
            System.out.println("The Average: " + avg.getAsDouble());
        } else {
            System.out.println("The Average wan't calculated.");
        }
    }
}
