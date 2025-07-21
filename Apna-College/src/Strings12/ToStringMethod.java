package Strings12;

public class ToStringMethod {
    public static void main(String[] args) {
        int number=123;
        String str=Integer.toString(number);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.getBytes());
        System.out.println(str.replace((char) 2, (char) 1));

    }

}
