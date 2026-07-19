/*Problem Statement: Given a String, write a program to remove vowels from the String.
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is not a vowel
            if ("AEIOUaeiou".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println("String after removing vowels: " + result);

        sc.close();
    }    
}
