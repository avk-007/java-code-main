package OperatorBinaryNoSystems14;
/*binary no system decimal to binary binary to decimal ex-4 ::lcm 0,0,1 &1,0,0*/
public class BinaryOperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 12, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));    // 17
        System.out.println("a - b = " + (a - b));    // 7
        System.out.println("a * b = " + (a * b));    // 60
        System.out.println("a / b = " + (a / b));    // 2
        System.out.println("a % b = " + (a % b));    // 2

        // Comparison/Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b: " + (a > b));     // true
        System.out.println("a < b: " + (a < b));     // false
        System.out.println("a >= b: " + (a >= b));   // true
        System.out.println("a <= b: " + (a <= b));   // false

        // Logical Operators (applied to boolean values)
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));   // false
        System.out.println("x || y: " + (x || y));   // true

        // Bitwise Operators
        int p = 6; // In binary: 0110
        int q = 3; // In binary: 0011

        System.out.println("p = " + p + " (Binary: " + Integer.toBinaryString(p) + ")");
        System.out.println("q = " + q + " (Binary: " + Integer.toBinaryString(q) + ")");
        System.out.println();

        // 1. Bitwise AND (&)
        // Compares each bit: result is 1 if BOTH bits are 1, else 0.
        // 0110
        // 0011
        // ----
        // 0010 (which is 2)
        int andResult = p & q;
        System.out.println("Bitwise AND (p & q): " + andResult + " (Binary: " + Integer.toBinaryString(andResult) + ")");

        // 2. Bitwise OR (|)
        // Compares each bit: result is 1 if AT LEAST ONE is 1, else 0.
        // 0110
        // 0011
        // ----
        // 0111 (which is 7)
        int orResult = p | q;
        System.out.println("Bitwise OR (p | q): " + orResult + " (Binary: " + Integer.toBinaryString(orResult) + ")");

        // 3. Bitwise XOR (^)
        // Compares each bit: result is 1 ONLY if the bits are DIFFERENT, else 0.
        // 0110
        // 0011
        // ----
        // 0101 (which is 5)
        int xorResult = p ^ q;
        System.out.println("Bitwise XOR (p ^ q): " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")");

        // 4. Bitwise NOT (~)
        // Flips each bit: 0 to 1 and 1 to 0.
        // Inverts all 32 bits, so for small positive numbers the result is negative
        // For 6 (0000...0110), ~6 = 1111...1001 (which represents -7 in two's complement)
        int notResult = ~p;
        System.out.println("Bitwise NOT (~p): " + notResult + " (Binary: " + Integer.toBinaryString(notResult) + ")");

        // 5. Left Shift (<<)
        // Shifts all bits to the left; fills right with 0s.
        // Each shift to the left essentially multiplies the number by 2.
        // Example: 0110 << 1 = 1100 (leftmost bits shift over; fills rightmost with 0)
        int leftShift = p << 1;
        System.out.println("Left Shift (p << 1): " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");

        // 6. Right Shift (>>)
        // Shifts all bits to the right; fills left with 0 for positives, or 1 for negatives (sign bit).
        // Each shift to the right divides the number by 2.
        // Example: 0110 >> 1 = 0011
        int rightShift = p >> 1;
        System.out.println("Right Shift (p >> 1): " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");

        // 7. Unsigned Right Shift (>>>)
        // Always fills leftmost bits with 0, even for negative numbers.
        // For positive numbers, result is same as >>
        int unsignedRightShift = p >>> 1;
        System.out.println("Unsigned Right Shift (p >>> 1): " + unsignedRightShift + " (Binary: " + Integer.toBinaryString(unsignedRightShift) + ")");

        /*
         * Summary Table:
         *
         * Operator | Java Symbol | Example    | Result (Decimal) | Result (Binary)
         * ------------------------------------------------------------------------
         *    AND   |     &      |   6 & 3    |        2         |   0010
         *    OR    |     |      |   6 | 3    |        7         |   0111
         *    XOR   |     ^      |   6 ^ 3    |        5         |   0101
         *    NOT   |     ~      |    ~6      |       -7         |   ...1001
         * Left Shf |    <<      |  6 << 1    |       12         |   1100
         * RightShf |    >>      |  6 >> 1    |        3         |   0011
         * Uns.RSht |   >>>      | 6 >>> 1    |        3         |   0011
         *
         * Note: Negative result for ~6 is because integers are stored in two's complement in Java.
         */


        //assignement opeartors

    }
}

