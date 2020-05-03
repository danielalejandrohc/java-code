import java.util.Arrays;

// https://projecteuler.net/problem=16
public class PowerDigit {
    public static void main(String[] args) {
        int base = 2, pow = 1000;
        Double powResult = Math.pow(base, pow);
        String[] powArray = powResult.toString().split("\\.")[0].split("");
        int result = Arrays.asList(powArray).stream().mapToInt(n -> Integer.valueOf(n)).sum();
        System.out.printf("%d pow %d = %f Sum = %d\n", base, pow, powResult, result);
    }
}
