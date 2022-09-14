public class Palindrome {
    public static boolean isPalindrome(String s) {
        if(s == null) return false;
        String rev = "";
        boolean ans = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.toLowerCase().equals(rev.toLowerCase())) {
            ans = true;
        }
        return ans;
    }
}
