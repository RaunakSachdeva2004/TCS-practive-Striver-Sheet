/*Problem Statement:
Given an array, we have to find the largest element in the array. */

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the elements in the array: ");
        
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.print("Largest = " + max);

    }
    
}
