/*Problem Statement:
Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.
*/

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr[(i + k) % n];
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
