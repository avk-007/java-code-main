package BitManupulation15;


public class HWBitManipulation {

    // 1. Check if a number is a power of 2
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // 2. Toggle A bit at position 'pos' (0-based from LSB)
    public static int toggleBit(int n, int pos) {
        return n ^ (1 << pos);
    }

    // 3. Count the number of 1's in the binary representation of n
    public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);  // remove the rightmost set bit
            count++;
        }
        return count;
    }

    // 4a. Convert decimal to binary string
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append((n & 1) == 1 ? '1' : '0');
            n >>= 1;
        }
        return sb.reverse().toString();
    }

    // 4b. Convert binary string to decimal integer
    public static int binaryToDecimal(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result = (result << 1) + (binary.charAt(i) - '0');
        }
        return result;
    }

    //4b alternate
     /*int num = 0;
    for (char c : binary.toCharArray()) {
        num = (num << 1) + (c - '0');
      }
    return num;*/

    // Main method to demonstrate usage
    public static void main(String[] args) {
        int num = 16;
        System.out.println(num + " is power of 2? " + isPowerOfTwo(num));

        int pos = 2;
        int toggled = toggleBit(num, pos);
        System.out.println("Toggle bit at position " + pos + " in " + num + ": " + toggled);

        int count = countOnes(num);
        System.out.println("Number of 1's in binary representation of " + num + ": " + count);

        int decimal = 23;
        String binaryStr = decimalToBinary(decimal);
        System.out.println("Decimal " + decimal + " to binary: " + binaryStr);

        String binaryNum = "10111";
        int decimalVal = binaryToDecimal(binaryNum);
        System.out.println("Binary " + binaryNum + " to decimal: " + decimalVal);
    }
}
