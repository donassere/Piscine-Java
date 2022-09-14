import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        ArrayList<Integer> rep = new ArrayList<Integer>();
        if(coins == null) return rep;
        if(amount == 0) return rep;
        Integer[] L = coins.toArray(new Integer[0]);
        for(int i=0; i<L.length;i++){
            for(int j=i+1; j<L.length;j++){
                if(L[i]<L[j]){
                    int tmp = L[j];
                    L[j]=L[i];
                    L[i]=tmp;
                }
            }
        }
        for(int i : L){
            if(amount>=i) {
                for (int j = 0; j < amount / i; j++) {
                    rep.add(i);
                }
                amount = amount % i;
            }
        }

        return rep;
    }
}
