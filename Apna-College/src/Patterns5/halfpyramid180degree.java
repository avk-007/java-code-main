package Patterns5;

public class halfpyramid180degree {
    public static void main(String[] args) {
        int n = 4;
 //outer loop
        for (int i=1;i<=n;i++){
            //innner loop-> space print
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //innner loop-> start print
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

        /*
         *
         **
         ***
         ****  */


