/*Problem:
Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number) */

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int sum = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else {
                sum += num;
                num = 0;
            }
        }

        // Add the last number (if the string ends with a digit)
        sum += num;

        System.out.println("Sum of numbers: " + sum);

        sc.close();
}
}
