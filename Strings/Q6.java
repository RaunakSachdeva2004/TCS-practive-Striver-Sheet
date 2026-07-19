/*Problem Statement:
Write a program to remove all characters from a string except alphabets in a given string.
*/
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Append only alphabets
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result.append(ch);
            }
        }

        System.out.println("String after removing non-alphabet characters: " + result);

        sc.close();
    }
}