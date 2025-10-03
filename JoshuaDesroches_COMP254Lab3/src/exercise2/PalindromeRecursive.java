package exercise2;

public class PalindromeRecursive {
    public static boolean checkPalindrome(String s, int x, int y)
    {
        if(x >= y)
            return true;
        else if(s.charAt(x) == s.charAt(y)) {
            x++; y--;
            return checkPalindrome(s, x, y);
        }
        else
            return false;
    }
}
