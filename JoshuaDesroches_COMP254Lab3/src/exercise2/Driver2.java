package exercise2;

public class Driver2 {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(s + " is a palindrome = " + PalindromeRecursive.checkPalindrome(s, 0, s.length()-1));
    }
}
