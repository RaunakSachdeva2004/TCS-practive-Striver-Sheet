/*Problem Statement:
Given a character, Find the ASCII value of the character.
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        sc.close();
    }
}
