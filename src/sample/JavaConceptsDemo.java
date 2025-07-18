package sample;
/*
 * sample.JavaConceptsDemo.java
 *
 * A single reference class demonstrating major Java concepts:
 * - Operators, Control Flow, Packages
 * - Inheritance, Interfaces, Arrays
 * - Collections, Generics, Streams
 * - Functional Programming, Multithreading
 * - Java 8+ to Java 24 features
 *
 * OUTPUT: Sample outputs in comments above relevant lines.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;

public class JavaConceptsDemo {
    public static void main(String[] args) throws InterruptedException {
        // Section 7: Operators
        int a = 10, b = 3;
        int sum = a + b; // 13
        int diff = a - b; // 7
        int prod = a * b; // 30
        int quot = a / b; // 3
        int rem = a % b; // 1

        String s = "Hello" + " World"; // Hello World

        a += 5; // 15
        a++; // 16

        boolean isEqual = (a == b);
        boolean logic = (a > 5) && (b < 5);

        int bit = 5 << 1; // 10
        int max = (a > b) ? a : b;

        // Section 8: Control Flow
        if (a > b) {
            System.out.println("a is greater");
        }

        String res = (a > b) ? "a" : "b";

        switch (b) {
            case 1 -> System.out.println("One");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Other");
        }

        for (int i = 0; i < 3; i++) {
            if (i == 1) continue;
            if (i == 2) break;
        }

        // Section 9: Packages (this file is already in a package)

        // Section 10: Inheritance
        Animal animal = new Dog();
        if (animal instanceof Dog) {
            animal.makeSound();
        }

        // Section 11: Interfaces
        Drawable d = new Circle();
        d.draw();

        // Section 12: Arrays
        int[] arr = {1, 2, 3};
        for (int val : arr) System.out.println(val);

        // Section 13: Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // int n = sc.nextInt(); // user input
        }

        // Section 14: Exceptions
        try {
            // int x = 1 / 0; // Intentionally throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        } finally {
            System.out.println("Always runs");
        }

        // Section 15: Object methods
        System.out.println(animal); // toString() is called implicitly

        // Section 16: Collections
        List<String> list = new ArrayList<>();
        list.add("apple");

        // Section 17: ArrayList
        list.forEach(System.out::println);

        // Section 18: LinkedList
        LinkedList<String> ll = new LinkedList<>(list);

        // Section 19: Generics
        Box<Integer> box = new Box<>(123);

        // Section 20: Maps
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        // Section 21: Sets
        Set<String> set = new HashSet<>();
        set.add("x");

        // Section 22: Enums
        Status status = Status.SUCCESS;
        System.out.println(status);

        // Section 23: Date & Time
        LocalDate today = LocalDate.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // Section 24: Lambda
        Runnable r = () -> System.out.println("Running thread");
        r.run();

        // Section 25: Method Reference
        Function<String, Integer> parser = Integer::parseInt;
        System.out.println(parser.apply("100"));

        // Section 26: Streams
        List<String> names = new ArrayList<>(List.of("aa", "bbb", "cc"));
        names.stream().filter(n -> n.length() > 2).forEach(System.out::println);

        // Section 27: Optional
        Optional<String> opt = Optional.of("val");
        opt.ifPresent(System.out::println);

        // Section 28: Multithreading
        Thread t = new Thread(() -> System.out.println("In thread"));
        t.start();
        t.join();

        // Section 29: Java 22+ Features
        var point = new Point(1, 2);
        System.out.println(point);
    }

    // Section 10: Inheritance classes
    static class Animal {
        public void makeSound() {
            System.out.println("Animal sound");
        }

        @Override
        public String toString() {
            return "Animal instance";
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }

        @Override
        public String toString() {
            return "Dog instance";
        }
    }

    // Section 11: Interface
    interface Drawable {
        void draw();
    }

    static class Circle implements Drawable {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    // Section 19: Generic class
    static class Box<T> {
        final T value;
        Box(T value) { this.value = value; }
        public T get() { return value; }
    }

    // Section 22: Enum
    enum Status {
        SUCCESS(1), FAILURE(0);
        int code;
        Status(int code) { this.code = code; }
    }

    // Section 29: Java 16+ Record class
    record Point(int x, int y) {
        // You can add methods or validation logic here if needed
    }
}
