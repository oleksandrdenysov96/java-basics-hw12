import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int[] even = Arrays.stream(numbers)
                .filter(x -> x % 2 == 0).map(x -> x * x).toArray();

        return IntStream.of(even).sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        int[] odd = Arrays.stream(numbers)
                .filter(x -> x % 2 != 0)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(odd));
        return odd;
    }
}
