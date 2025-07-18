package Patterns5;

public class FloydTriangle {
//with increment in no
    public static void main(String[] args) {

        int n = 5;
        int number=1;
        //outer loop row
        for (int i = 1; i <= n; i++) {
            //iner loop columns
            for (int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++; //number=number+1
        }
            System.out.println();
        }
    }

/*          1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15*/
}
