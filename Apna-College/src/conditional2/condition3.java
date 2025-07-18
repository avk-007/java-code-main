package conditional2;

import java.util.Scanner;

public class condition3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }
        else if(a>b){
            System.out.println("greater");
        } else {
                System.out.println("lesser");
            }
    }
}

