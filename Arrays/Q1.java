/*  Problem Statement:
Given an array, we have to find the smallest element in the array.

*/
import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the elements in the array: ");
        
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.print("Smallest = " + min);

    }
}