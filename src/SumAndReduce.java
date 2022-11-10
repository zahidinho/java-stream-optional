import java.util.List;

public class SumAndReduce {
    public static int calculate(List<Integer> numbers) {
        return numbers.stream()
                .reduce((i, sum) -> sum + i)
                .orElse(0);
    }
}