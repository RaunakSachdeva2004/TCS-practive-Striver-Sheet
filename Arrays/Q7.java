/*Problem Statement:
Given an array arr of size n, the task is to find the sum of all the elements in the array .
*/

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(arr).sum());
    }
}
