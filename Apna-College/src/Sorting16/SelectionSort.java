package Sorting16;
/*
Idea:
 - Find the minimum element in the unsorted array.
 - Swap it with the element at the current position.
 - Place each element in its correct sorted position.

Time Complexity: O(N^2)
* */

//it is opposite of bubble sort.
public class SelectionSort {
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};

        for(int i = 0; i < arr.length - 1; i++) {
            //selection sort sortest to highest.
            int smallest=i;
            for (int j=1+1;j<arr.length;j++){
                if (arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            //swap arr[i] and arr[smallest]
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        printArray(arr);
    }

}
