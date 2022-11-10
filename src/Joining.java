import java.util.List;

public class Joining {
    public static String namesToString(List<Person> people) {
        return "Names: " + people.stream()
                .map(Person::getName)
                .reduce((i, sum) -> i + ", " + sum)
                .orElse("") + ".";
    }
}