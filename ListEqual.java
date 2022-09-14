import java.util.List;

public class ListEqual {
    public static boolean areListEquals(List<String> list1, List<String> list2) {
        int y = 0;
        if (list1 == null && list2 == null) {
            return true;
        } else if (list1 == null || list2 == null) {
            return false;
        } else if (list1.isEmpty() && list2.isEmpty()) {
            return true;
        } else if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                y = y + 1;
            }
            if (y == list1.size()) {
                return true;
            }
        }
        return false;

    }
}
