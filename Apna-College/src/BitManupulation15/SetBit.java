package BitManupulation15;

public class SetBit {
    //    set Bit & Operation OR
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;

        int number=bitmask | n;
        System.out.println(number);
    }
}
