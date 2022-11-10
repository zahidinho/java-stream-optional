import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {
    public static Set<String> getKidNames(List<Person> people) {
        return people.stream()
                .filter(p -> p.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toSet());
    }
}