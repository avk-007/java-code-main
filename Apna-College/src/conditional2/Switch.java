package conditional2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
//        switch (button is variable)
        switch (button){
            case 1:
            System.out.println("hello");
            break;

            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjur");
                break;
            default:
                System.out.println("invalid");

//used when no of if else cases.
        }
    }
}
