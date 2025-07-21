package OperatorBinaryNoSystems14;

public class ExIncrement {
    public static void main(String[] args) {
        //for c++
        int a = 10;
        int b = 0;

        b = ++a; //use value and change value. so a=11 AND b =11
        System.out.println(a); //11
        System.out.println(b); // 11

        //for ++a
        int c=10;
        int d=0;

        d = c++; //change vcalue and assign value.
        System.out.println(c); //c++ means 10+1=11
        System.out.println(d); // d ko assign kar denge 10


    }
}
