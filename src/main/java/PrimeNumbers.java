import java.util.ArrayList;
import java.util.List;

// https://projecteuler.net/problem=3
/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        List<Integer> primes = findPrimes(13195  );
        System.out.printf("Result " + primes);
    }

    public static List<Integer> findPrimes(Integer number) {
        List<Integer> ret = new ArrayList<>();
        for(int i = 1; i <= number; i++) {
            if ((number % i) == 0 && isPrime(i)) {
                ret.add(i);
            }
        }
        return ret;
    }

    public static boolean isPrime(Integer number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if((number % i) == 0) {
                count++;
            }
        }
        return count == 2;
    }

}
