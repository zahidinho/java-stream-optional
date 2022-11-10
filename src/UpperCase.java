import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    // }

    public static Collection<String> mapToUppercase(String... names) {
        return Arrays.asList(names).stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
    }
}