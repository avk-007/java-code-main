package FunctionandMethods7and8.questions;

import java.util.Scanner;

/*Write a function that takes in age as input and returns if that person is eligible to
 vote or not. A person of age > 18 is eligible to vote.*/
public class Elligible {
    public static boolean isElligible(int age) {
        if(age > 18) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isElligible(age));
    }
}

