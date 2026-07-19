public class Q1 {

    public static boolean palindrome(int i, String s) {
        // Base Condition
        if (i >= s.length() / 2)
            return true;

        // Compare characters
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        // Recursive call
        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {
        String s = "ABCDDCBA";
        System.out.println(palindrome(0, s));
    }
}