package sample;

public class JavaStringDeepDive {

    /*
    Where Does Java Store Classes, Objects, Variables, Methods?

        •	Classes & static vars → Method Area
        •	Objects → Heap
        •	Local vars → Stack

      Deep Dive on Heap and Stack Memory
        •	Heap: stores objects
        •	Stack: stores method calls and local variables
   */

    public static void main(String[] args) {

        // String Pool and intern()
        String s1 = "sample.hello"; // creates a new String object outside of string pool
        String s2 = s1.intern();         // refers to the pooled string "sample.hello"
        String s3 = "sample.hello";

        System.out.println("s1 == s2: " + (s1 == s2)); // false
        System.out.println("s2 == s3: " + (s2 == s3)); // true

        // concat() method
        String s4 = s1.concat(" world");
        System.out.println("Concatenated: " + s4); // sample.hello world

        // Escape Sequences and Unicode
        String s5 = "Line1\nLine2\u00A9";
        System.out.println("Escape and Unicode:\n" + s5);

        // Finding Length
        int len = s5.length();
        System.out.println("Length of s5: " + len);

        // Comparing Strings
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1 == s3: " + (s1 == s3));          // false (different objects)

        // Fetching character at index
        char ch = s1.charAt(0);
        System.out.println("Character at index 0 of s1: " + ch); // h

        // Check if string is empty
        String s6 = "";
        System.out.println("s6 is empty: " + s6.isEmpty()); // true

        // Changing case
        System.out.println("UpperCase: " + s1.toUpperCase()); // HELLO
        System.out.println("LowerCase: " + s1.toLowerCase()); // sample.hello

        // Converting values to String
        String numStr = String.valueOf(10);
        System.out.println("String value of 10: " + numStr); // "10"

        // Searching for a value
        int index = s4.indexOf("world");
        System.out.println("Index of 'world' in s4: " + index); // 6

        // Trimming strings
        String s7 = "   trim me   ";
        System.out.println("Trimmed: '" + s7.trim() + "'"); // "trim me"

        // Fetching substring
        String sub = s4.substring(0, 5);
        System.out.println("Substring of s4: " + sub); // sample.hello

        // Replacing part of string
        String replaced = s4.replace("sample.hello", "hi");
        System.out.println("Replaced string: " + replaced); // hi world

        // Splitting strings
        String s8 = "apple,banana,grape";
        String[] parts = s8.split(",");
        System.out.println("Splitting s8:");
        for (String part : parts) {
            System.out.println(part); // apple\nbanana\ngrape
        }

        // Joining strings
        String joined = String.join(" | ", parts);
        System.out.println("Joined string: " + joined); // apple | banana | grape

        // String formatting
        String formatted = String.format("Name: %s, Age: %d", "Alice", 30);
        System.out.println("Formatted: " + formatted); // Name: Alice, Age: 30

        // printf
        System.out.printf("Name: %s, Age: %d\n", "Bob", 25); // Name: Bob, Age: 25

        // String Immutability
        String immutable = "immutable";
        String changed = immutable.replace("immutable", "changed");
        System.out.println("Original: " + immutable); // immutable
        System.out.println("Changed: " + changed);    // changed

        // Mutable String using StringBuilder
        System.out.println("StringBuilder content: " + "Hello" + " World"); // Hello World

        // Text Blocks (Java 15+)
        String textBlock = """
                Line1
                Line2
                """;
        System.out.println("Text Block:\n" + textBlock);

        // Converting String to Primitive Types
        int intVal = Integer.parseInt("123");
        double doubleVal = Double.parseDouble("12.34");
        System.out.println("Integer value: " + intVal);   // 123
        System.out.println("Double value: " + doubleVal); // 12.34
    }
}
