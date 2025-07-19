package FunctionandMethods;

import java.util.Scanner;

public class AddTwoNo {

    public static int AddNo(int a,int b){
      int sum=a+b;
      return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        int sum=AddNo(a,b);
        System.out.println("sum is : "+ sum);
    }

}
