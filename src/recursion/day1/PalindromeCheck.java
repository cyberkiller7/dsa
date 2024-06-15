package recursion.day1;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "abba";
        int n = s.length();
        System.out.println(checkPalindrome(0, n-1, s));
    }

    public static boolean checkPalindrome(int k, int n, String s){
        if(k>=n)
            return true;
        if(s.charAt(k)!=s.charAt(n))
            return false;
        return checkPalindrome(k+1, n-1, s);
    }
}
