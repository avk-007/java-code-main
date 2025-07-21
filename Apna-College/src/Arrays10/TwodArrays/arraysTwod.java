package Arrays10.TwodArrays;

import java.util.Scanner;

public class arraysTwod {
    //
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int rows= scanner.nextInt();
        int columns= scanner.nextInt();

        int[][] numbers=new int[rows][columns];//define or declare
        //cosider everything in matrix box form

        //inpout loop 1
        //rows
        for (int i=0;i<rows;i++){
           //columns
            for (int j=0;j<columns;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        //output
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
