import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static List<Integer> sort(List<Integer> list) {
        if (list == null) return null;
        return  list.stream().sorted().collect(Collectors.toList());
    }
    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) return null;
        list = list.stream().sorted().collect(Collectors.toList());
        for(int i =0; i< list.size()/2;i++){
            int tmp= list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, tmp);
        }
        return list;
    }
}
