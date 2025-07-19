package FunctionandMethods7and8.questions;

import java.util.*;
/*
Write a function that takes in the radius as input and returns the circumference of a circle.
*/
public class Circumference {
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(getCircumference(r));
    }
}

