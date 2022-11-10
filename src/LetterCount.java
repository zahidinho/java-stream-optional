import java.util.Arrays;

public class LetterCount {
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        Arrays.asList(names).stream().filter(name -> name.length() > 5).mapToInt(name -> name.length()).count();
        return 0;
    }
}
