package OperatorBinaryNoSystems14;

public class BinaryNumberSystemDemo {
    public static void main(String[] args) {

        // 1. Representing numbers in binary (Java 7 onwards supports binary literals with 0b prefix)
        int binaryNum = 0b1011;  // 1011 in binary = 11 in decimal
        System.out.println("Binary literal 0b1011 (decimal): " + binaryNum); // 11

        // 2. Convert decimal to binary String
        int decimal = 23;
        String binaryString = Integer.toBinaryString(decimal);
        System.out.println("Decimal 23 in binary: " + binaryString); // 10111

        // 3. Convert binary String to decimal
        String myBinary = "1101";
        int decimalValue = Integer.parseInt(myBinary, 2);
        System.out.println("Binary 1101 in decimal: " + decimalValue); // 13

        // 4. Arithmetic with binary numbers
        int a = 0b100;  // 4 in decimal
        int b = 0b11;   // 3 in decimal
        int sum = a + b;
        System.out.println("Sum of 0b100 and 0b11 (binary): " + Integer.toBinaryString(sum)); // 111
        System.out.println("Sum of 0b100 and 0b11 (decimal): " + sum); // 7

        // 5. Printing the binary representation of a number
        int number = 8;
        System.out.println("Binary representation of 8: " + Integer.toBinaryString(number)); // 1000

        // 6. Show how to get each bit from an int (for 0b1011)
        System.out.print("Bits in 0b1011: ");
        for (int i = 3; i >= 0; i--) {
            int bit = (binaryNum >> i) & 1;
            System.out.print(bit);
        }
        System.out.println(); // Output: 1011
    }
}
