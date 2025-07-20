package TimeComplexity9;
public class ComplexityExamples {

    /*
     * Example 1: Constant Time, Constant Space (O(1), O(1))
     * Explanation:
     * This method demonstrates constant time and space complexity because no matter the input,
     * it simply assigns a value and prints it. This is as fast and efficient as it gets.
     * Output: Example 1: Constant Time, Constant Space Output: 42
     */
    static void example1() {
        int x = 42;
        System.out.println("Example 1: Constant Time, Constant Space Output: " + x);
    }

    // Example 2: Linear Time, Constant Space (O(n), O(1))
    // Explanation:
    // This method iterates over an array and prints each element.
    // Time: The number of operations grows in proportion to the input array size (n).
    // Space: No extra space is required besides a loop variable.
    // Output: Example 2: Linear Time, Constant Space Output: 1 2 3 4 5
    static void example2() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Example 2: Linear Time, Constant Space Output: ");
        for(int a : arr) System.out.print(a + " ");
        System.out.println();
    }

    /*
     * Example 3: Quadratic Time, Constant Space (O(n^2), O(1))
     * Explanation:
     * Demonstrates nested loops; each element pairs with every other element,
     * so the operation count is n² (n times for i, n times for j).
     * Output: Pairs of i,j indices for n=3 (9 pairs printed).
     * Output: Example 3: Quadratic Time Output: (0,0) (0,1) ... (2,2)
     */
    static void example3() {
        System.out.print("Example 3: Quadratic Time Output: ");
        int n = 3;
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                System.out.print("(" + i + "," + j + ") ");
        System.out.println();
    }

    // Example 4: Logarithmic Time, Constant Space (O(log n), O(1))
    // Explanation:
    // This is a binary search. The search range is halved with each step,
    // so the time complexity is logarithmic. Only a few variables are used.
    // Output: Found at index 3 if the target exists.
    static void example4() {
        int[] sorted = {1, 3, 5, 7, 9};
        int target = 7, left = 0, right = sorted.length - 1;
        int found = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(sorted[mid] == target) {
                found = mid; break;
            } else if(sorted[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println("Example 4: Logarithmic Time Output: Found at index " + found);
    }

    /*
     * Example 5: Linearithmic Time, Linear Space (O(n log n), O(n))
     * Explanation:
     * Implements merge sort, which works by recursively dividing the array and
     * merging sorted parts. Time grows as n*log(n) and space due to extra arrays during merge.
     * Output: Sorted array.
     */
    static void example5() {
        int[] arr = {3, 1, 4, 1, 5};
        mergeSort(arr, 0, arr.length-1);
        System.out.print("Example 5: Linearithmic Time (Merge Sort) Output: ");
        for(int a : arr) System.out.print(a + " ");
        System.out.println();
    }
    // Helper for merge sort (recursive)
    static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int m = (l+r)/2;
            mergeSort(arr, l, m); mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    // Helper for merging step of merge sort
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1, n2 = r-m;
        int[] L = new int[n1], R = new int[n2]; // Extra space O(n)
        for(int i=0;i<n1;i++) L[i]=arr[l+i];
        for(int j=0;j<n2;j++) R[j]=arr[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2) arr[k++] = L[i]<R[j]?L[i++]:R[j++];
        while(i<n1) arr[k++]=L[i++];
        while(j<n2) arr[k++]=R[j++];
    }

    /*
     * Example 6: Exponential Time, Linear Space (O(2^n), O(n))
     * Explanation:
     * Basic recursive Fibonacci calculation.
     * Each call spawns two more recursive calls, so time is O(2^n), while
     * the space used is linear due to the call stack depth.
     * Output: nth Fibonacci number.
     */
    static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
    static void example6() {
        int n = 5;
        System.out.println("Example 6: Exponential Time (Recursive Fibonacci 5): " + fib(n));
    }

    // Example 7: Linear Space (O(n))
    // Explanation:
    // Copies an array into a new array.
    // Uses O(n) extra space for the copy, time is also linear due to element-wise copying.
    // Output: Copied array elements.
    static void example7() {
        int n = 4;
        int[] arr = {1,2,3,4}, copy = new int[n];
        System.arraycopy(arr, 0, copy, 0, n);
        System.out.print("Example 7: Space O(n) Output: ");
        for(int c : copy) System.out.print(c + " ");
        System.out.println();
    }

    /*
     * Example 8: Cubic Time, Constant Space (O(n^3), O(1))
     * Explanation:
     * Three nested loops; for every value of i, every value of j, and every value of k,
     * the innermost code runs. So total operations are n³. No extra data structures used.
     * Output: Count of iterations.
     */
    static void example8() {
        int n = 2, count = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                    count++;
        System.out.println("Example 8: Cubic Time (nested loops) Output: Count = " + count);
    }

    // Example 9: Linear Time, Linear Space (O(n), O(n))
    // Explanation:
    // Creates a new array, where each element is original + 1.
    // Time is O(n) (must visit every element), and space is O(n) (output array).
    // Output: New incremented array.
    static int[] example9sumArray(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++) result[i] = arr[i] + 1;
        return result;
    }
    static void example9() {
        int[] res = example9sumArray(new int[]{5,6,7});
        System.out.print("Example 9: Linear Time, Linear Space Output: ");
        for(int r : res) System.out.print(r + " ");
        System.out.println();
    }

    /*
     * Example 10: Linear Time, Constant Space (O(n), O(1))
     * Explanation:
     * Finds the maximum value of an array by checking each element once.
     * Only a single variable is used, so space is constant.
     * Output: Maximum element found.
     */
    static void example10() {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
            if(arr[i] > max) max = arr[i];
        System.out.println("Example 10: Linear Time, Constant Space Output (Max): "+max);
    }

    /**
     * Main method to run every example and display the output and explanations.
     * Calls each demonstration method in order.
     */
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
        example10();
    }
}
