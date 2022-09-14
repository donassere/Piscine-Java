public class StringLength {
    public static int getStringLength(String s) {
        int sL = 0;
        if(s == null) return 0;
        for(int i=0; i<s.length();i++)  {
            sL += 1;
        }
        return sL;
    }
}
