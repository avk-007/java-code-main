package sample;// [JAVA 8] Functional Programming using lambda expressions

/* Introduction to Functional Programming treats computation as evaluation of functions */

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

// 2. Imperative vs Functional Style
class ImperativeVsFunctional {
    public static void main(String[] args) {
        // Imperative
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        for (String name : names) {
            System.out.println(name);
        }

        // Functional
        names.forEach(System.out::println);
    }
}

// 3. Lambda Expression Syntax
// (parameters) -> expression

// 4. How to Build Lambda Expressions
interface Greeting {
    void sayHello();
}
class LambdaExample {
    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello, Lambda!");
        greet.sayHello();
    }
}

// 5. Functional Interface
@FunctionalInterface
interface MyFunction {
    int operate(int a, int b);
}

// 6. Linking Functional Interface & Lambda
class Operation {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        System.out.println(add.operate(5, 3));
    }
}

// 7. Anonymous Inner Class
class InnerClassVsLambda {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Inside Anonymous Class");
            }
        };
        Runnable r2 = () -> System.out.println("Inside Lambda Expression");

        r1.run();
        r2.run();
    }
}

// 8. Predefined Functional Interfaces
// Predicate, Function, Consumer, Supplier

// 9. Predicate
class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.test(""));
    }
}

// 10. Function
class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> strLength = s -> s.length();
        System.out.println(strLength.apply("Java"));
    }
}

// 11. UnaryOperator
class UnaryExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(4));
    }
}

// 12. Consumer
class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello Consumer");
    }
}

// 13. Supplier
class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}

// 14. BiFunction
class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(3, 5));
    }
}

// 15. Primitive Type Functional Interfaces: IntPredicate, IntFunction, etc.
class PrimitiveFuncExample {
    public static void main(String[] args) {
        IntPredicate isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
    }
}

// 16. Lexical Scoping
class ScopeExample {
    public static void main(String[] args) {
        String message = "Hi";
        Runnable r = () -> System.out.println(message);
        r.run();
    }
}

// 17. this and super
class Outer {
    String name = "sample.Outer";

    class Inner {
        String name = "Inner";

        void show() {
            Runnable r = () -> {
                System.out.println(this.name); // refers to Inner's 'name'
                System.out.println(Outer.this.name); // refers to sample.Outer's 'name'
            };
            r.run();
        }
    }
}

// [JAVA 8] Method References

// 18. Static Method Reference
class StaticMethodRef {
    static void saySomething() {
        System.out.println("Hello from static method");
    }
    public static void main(String[] args) {
        Runnable r = StaticMethodRef::saySomething;
        r.run();
    }
}

// 19. Instance Method Reference
class InstanceMethodRef {
    void sayHello() {
        System.out.println("Hello from instance method");
    }
    public static void main(String[] args) {
        InstanceMethodRef obj = new InstanceMethodRef();
        Runnable r = obj::sayHello;
        r.run();
    }
}

// 20. Instance method using Class type
class StringOps {
    public static void main(String[] args) {
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println(toUpper.apply("java"));
    }
}

// 21. Constructor Reference
class Message {
    Message(String msg) {
        System.out.println(msg);
    }
}
interface MessageCreator {
    Message create(String msg);
}
class ConstructorRef {
    public static void main(String[] args) {
        MessageCreator creator = Message::new;
        creator.create("Hello via constructor reference");
    }
}
