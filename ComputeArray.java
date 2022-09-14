public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if(array == null) return null;
        int[] res = new int[array.length];
        for(int i=0; i<array.length; i++) {
            if(Math.abs(array[i]) % 3 == 0) res[i] = array[i] * 5 ;
            if (array[i] == -1) res[i] = array[i];
            if((array[i]) % 3 == 1) res[i] = array[i] + 7 ;
            if(Math.abs(array[i]) % 3 == 2) res[i] = array[i];
        }
        return res;
    }
}
