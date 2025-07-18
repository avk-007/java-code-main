package Polymorphism;

public class Calculator {

    public int add (int a ,int b){
        return a+b;
    }
    public double add (double a ,double b){
        return a+b;
    }

    public int add (int a ,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(1,3));
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1,3,4));
    }
}

/*method overloading in java rewffered as compile time poly. or early binding bcz the decison of which
method to call happens at compile time based on method signatuire method paramaters before the program executed*/




