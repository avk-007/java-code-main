package FunctionandMethods7and8.questions;
//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int avaerage=(a+b+c)/3;
        System.out.println(avaerage);


    }
}
