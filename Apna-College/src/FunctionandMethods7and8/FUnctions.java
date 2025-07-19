package FunctionandMethods7and8;

import java.util.Scanner;

public class FUnctions{
//function method
    public static void printMyName(String name){
        System.out.println(name);
        return;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();
        printMyName(name); //call kiya function ko name ko
    }
}
