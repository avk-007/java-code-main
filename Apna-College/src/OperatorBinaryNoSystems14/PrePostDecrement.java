package OperatorBinaryNoSystems14;

public class PrePostDecrement {
    public static void main(String[] args) {
        //--a value change and value assign
        int a=10;
        int b=0;
        b=--a; // a is decremented to 9, then b is assigned 9
        System.out.println(a); //9
        System.out.println(b); //9


        //c-- value assign and and value change
        int c=10;
        int d=0;
        d=c--;// d is assigned 10 (the current value), then c is decremented to 9
        System.out.println(c); //9
        System.out.println(d); //10
    }
}
