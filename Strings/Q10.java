/*Problem Description: Given a string, write a program to capitalize the first and last character of each word of that string.
*/

import java.util.Scanner;

public class Q10 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        // Capitalize first character
        if (arr.length > 0 && arr[0] != ' ') {
            arr[0] = Character.toUpperCase(arr[0]);
        }

        // Capitalize first and last character of each word
        for (int i = 0; i < arr.length; i++) {

            // First character of a word
            if (i > 0 && arr[i - 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }

            // Last character of a word
            if (i < arr.length - 1 && arr[i + 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        // Capitalize last character of the string
        if (arr.length > 1 && arr[arr.length - 1] != ' ') {
            arr[arr.length - 1] = Character.toUpperCase(arr[arr.length - 1]);
        }

        System.out.println("Result: " + new String(arr));

        sc.close();
    }

}
