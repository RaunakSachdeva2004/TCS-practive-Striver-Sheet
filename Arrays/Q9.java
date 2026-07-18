/*Problem Statement:
Average of all the elements in the array . */

public class Q9{
    public static void main(String args[]){
        int n = 5;
        int arr[] = {1,2,3,4,5};
        double sum = 0;

        for(int i = 0;i<n;i++){
            sum = sum+(double)arr[i];
        }

        double average = sum / n;  //Taking the average of all elements
    System.out.println("The average is "+average);

    }
}