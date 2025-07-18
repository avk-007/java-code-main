package Patterns5;

/*
12345
1234
123
12
1
* */
public class InvertedHalfpyramidNumber {
    public static void main(String[] args) {
        int n = 5;
        //outer loop row
        for (int i = 1; i <= n; i++) {

            //inner loop columns
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print (j);
            }
            System.out.println();
        }
    }
}
