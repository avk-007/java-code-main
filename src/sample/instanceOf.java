package sample;

public class instanceOf {

    public static void main(String[] args) {
        String str="abhishek java developer";

        //using instanceof operator to check
        //if str is instance of string class
        boolean isStrInstance =str instanceof String;

        System.out.println(isStrInstance); //true
    }
}
