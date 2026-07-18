/*Problem Statement:
Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
 */

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};

        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;
        // Reverse the second half
        for (int i = n / 2, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int x : arr) {
        System.out.print(x + " ");
        }
    }
}

