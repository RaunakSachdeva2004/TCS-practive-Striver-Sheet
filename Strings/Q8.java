/*Problem Statement:
Given an algebraic expression, write a program to remove brackets from the algebraic expression.*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an algebraic expression: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Append only non-bracket characters
            if (ch != '(' && ch != ')' &&
                ch != '{' && ch != '}' &&
                ch != '[' && ch != ']') {
                result.append(ch);
            }
        }

        System.out.println("Expression after removing brackets: " + result);

        sc.close();
    }
}
