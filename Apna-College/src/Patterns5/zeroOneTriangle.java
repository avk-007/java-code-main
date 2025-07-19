package Patterns5;
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
public class zeroOneTriangle {
    public static void main(String[] args) {
        int n=5;
        //even -i+j
        //odd =i+J
        //outer loop coulumn
        for(int i=1;i<=n;i++){
            //inner loop row value
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if (sum%2==0){ //even
                System.out.print("1 ");
            }else{ //odd
                    System.out.print("0 ");
                }


            }
            System.out.println();

        }
    }
}
