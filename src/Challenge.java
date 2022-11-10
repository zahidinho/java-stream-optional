import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    public static String getString(List<Integer> list) {
        return list.stream().map(l -> {
            String s = "";
            if (l % 2 == 0) {
                s += "e" + l;
            } else {
                s += "o" + l;
            }

            return s;
        }).collect(Collectors.joining(","));
    }
}