package Arrays10.TwodArrays;

import java.util.Scanner;

/*Searching for an element x in a matrix.
 */
public class SearchFOrX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] numbers = new int[rows][columns];//define or declare
        //cosider everything in matrix box form

        //input loop 1
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        int x = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //compare with x
                if (numbers[i][j] == x) {
                    System.out.println("found at index ("+ i + ", "+ j + ")");
                }

            }
        }
    }
}

