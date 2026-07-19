/*Problem Statement: Given a string, write a program to remove all the whitespaces from the string.
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Append only characters that are not spaces
            if (ch != ' ') {
                result.append(ch);
            }
        }

        System.out.println("String after removing whitespaces: " + result);

            sc.close();
    }
}
