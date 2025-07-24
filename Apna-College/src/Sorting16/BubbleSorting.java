package Sorting16;

//bubble sort :: eg bubble ,we pick the element and push to last and vice versa,and it will create ascending order.
//used for asc desc,or you can refer sort in ecommerce website
/*
Idea:
 - Compare each pair of adjacent elements.
 - If arr[i] > arr[i+1], swap them.
 - Repeat the process N-1 times to place elements in their correct positions.

Time Complexity: O(N^2)
*/

//ex array-7 8 3 1 2
//sorted to 1 2 3 7 8 final output.
public class BubbleSorting {
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};

        // Bubble sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printArray(arr);
    }
}