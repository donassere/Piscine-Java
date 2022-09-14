import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        String[] F = first.toArray(new String[0]);
        String[] S = second.toArray(new String[0]);
        Map<String, String> Couple = new HashMap<>();
        if(S.length<F.length) {
            for(int i=0; i< S.length;i++){
                Couple.put(F[i],S[i]);
            }
        }
        if(S.length>=F.length) {
            for(int i=0; i< F.length;i++){
                Couple.put(F[i],S[i]);
            }
        }
        return Couple;
    }
}
