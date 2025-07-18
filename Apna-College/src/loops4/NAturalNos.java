package loops4;

import java.util.Scanner;

//sum of first n naturals numbers
public class NAturalNos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int n= scanner.nextInt();

       int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
