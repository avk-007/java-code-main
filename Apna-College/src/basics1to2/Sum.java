package basics1to2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //variables
        /*
        int a=2;
        int b=3;
        int sum=a+b;
        int mul=a*b;
        System.out.println(sum);
        System.out.println(mul);*/

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}
// java does not follow bodmas