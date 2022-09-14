public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if(s == null) return false;
        if(subString == null) return false;
        for(int i=0; i<s.length();i++) {
            if(subString.charAt(0) == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
