package org.example.sandbox.comparable;
import java.util.ArrayList;
import java.util.Collections;

public class FruitDriver {

    public static void main(String[] args) {

        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("Apple", 10));
        fruits.add(new Fruit("Orange", 5));
        fruits.add(new Fruit("Banana", 7));
        fruits.add(new Fruit("Apple", 3));
        fruits.add(new Fruit("Banana", 12));

        System.out.println("Before Sorting:");
        fruits.forEach(f -> System.out.println(f));

        // Sort using compareTo
        Collections.sort(fruits);

        System.out.println("\nAfter Sorting:");
        fruits.stream().forEach(f -> System.out.println(f));
    }
}
