import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if(list == null || value == null) return null;
        if(list.contains(value)) return list.lastIndexOf(value);
        return null;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if(list == null || value == null) return null;
        if(list.contains(value)) return list.indexOf(value);
        return null;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if(list != null && value != null && list.size() > 0 ){
            List<Integer> NewList =  new ArrayList<Integer>();
            for(int i=0;i<list.size();i++) {
                if(list.get(i).equals(value)){
                    NewList.add(i);
                }
            }
            return NewList;
        }
        return new ArrayList<>();
    }
} 
