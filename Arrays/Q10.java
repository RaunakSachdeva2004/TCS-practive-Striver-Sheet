/*Problem Statement: Given an unsorted array, find the median of the given array.
What is a Median?
Median is defined as the value which is present in the middle for a 
series of values. Note, in order to find the median of an array of integers, 
we must make sure they are sorted.

*/

import java.util.*;
public class Q10 {
    public static void main(String args[]){
        int[] arr = {5,13,9,7,1,9,2,9,11};

        int n = arr.length;
        Arrays.sort(arr);
        int mid = -1;
        if(n%2 == 0){
            mid = arr[n/2];
        }
        else{
            int ind1 = (n / 2) - 1;
        int ind2 = (n / 2);
            mid = arr[(ind1+ind2)/2];
        }


        System.out.print("Median: "+mid);


    }
}
