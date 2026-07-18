/*Problem Statement:
You are given an array. The task is to reverse the array and print it.*/

public class Q4 {
    public static void main(String[] args) {
        int N = 7, arr[] = {5,4,3,2,1, 256, 8575};

        int left = 0, right = N-1;

        while(left <=right){
            //swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

            
        }

        for (int i =0; i < N; i++) {
            System.err.print(arr[i] + " ");   
        }
    }
}
