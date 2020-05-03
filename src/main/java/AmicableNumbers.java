import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://projecteuler.net/problem=21
public class AmicableNumbers {

    public static void main(String[] args) {
        int inputNumber = 10000;
        int sum = Stream.iterate(1, n -> n + 1)
                .limit(inputNumber - 1)
                .filter(n -> inputNumber % n == 0)
                .mapToInt(x -> x).sum();
        System.out.println("Input: " + inputNumber + ", sum: " + sum);
    }

}
