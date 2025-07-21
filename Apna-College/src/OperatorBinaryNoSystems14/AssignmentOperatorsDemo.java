package OperatorBinaryNoSystems14;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // Simple assignment
        int a = 10; // '=' assigns 10 to a
        System.out.println("Simple assignment: a = " + a); // Output: 10

        // Addition assignment (+=)
        a += 5; // a = a + 5, so a becomes 15
        System.out.println("Addition assignment: a += 5 => " + a); // Output: 15

        // Subtraction assignment (-=)
        a -= 3; // a = a - 3, so a becomes 12
        System.out.println("Subtraction assignment: a -= 3 => " + a); // Output: 12

        // Multiplication assignment (*=)
        a *= 2; // a = a * 2, so a becomes 24
        System.out.println("Multiplication assignment: a *= 2 => " + a); // Output: 24

        // Division assignment (/=)
        a /= 4; // a = a / 4, so a becomes 6
        System.out.println("Division assignment: a /= 4 => " + a); // Output: 6

        // Modulus assignment (%=)
        a %= 5; // a = a % 5, so a becomes 1
        System.out.println("Modulus assignment: a %= 5 => " + a); // Output: 1

        // Bitwise AND assignment (&=)
        int b = 7; // b in binary: 0111
        b &= 3;    // b = b & 3; 3 in binary: 0011; 0111 & 0011 = 0011 (3)
        System.out.println("Bitwise AND assignment: b &= 3 => " + b); // Output: 3

        // Bitwise OR assignment (|=)
        b |= 8;    // b = b | 8; 8 in binary: 1000; 0011 | 1000 = 1011 (11)
        System.out.println("Bitwise OR assignment: b |= 8 => " + b); // Output: 11

        // Bitwise XOR assignment (^=)
        b ^= 2;    // b = b ^ 2; 11^2: 1011^0010=1001(9)
        System.out.println("Bitwise XOR assignment: b ^= 2 => " + b); // Output: 9

        // Left shift assignment (<<=)
        int c = 4; // c in binary: 0100
        c <<= 2;   // c = c << 2; Moves bits left by 2 places: 0100 => 10000 (16)
        System.out.println("Left shift assignment: c <<= 2 => " + c); // Output: 16

        // Right shift assignment (>>=)
        c >>= 1;   // c = c >> 1; Moves bits right by 1 place: 10000 => 01000 (8)
        System.out.println("Right shift assignment: c >>= 1 => " + c); // Output: 8

        // Unsigned right shift assignment (>>>=)
        c >>>= 1;  // c = c >>> 1; Moves bits right by 1, filling left with 0: 01000 => 00100 (4)
        System.out.println("Unsigned right shift assignment: c >>>= 1 => " + c); // Output: 4

        // Chained assignment
        int x, y, z;
        x = y = z = 99; // All variables are set to 99 with chain of '='
        System.out.println("Chained assignment: x = y = z = 99 => " + x + " " + y + " " + z); // Output: 99 99 99
    }
}
