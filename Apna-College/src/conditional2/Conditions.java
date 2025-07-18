package conditional2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("adult");
        }
        else {
            System.out.println("not adult");
        }
    }
}

//operator modular % for reminder. x/2=zero even ,x/2=not zero=odd
//ex
