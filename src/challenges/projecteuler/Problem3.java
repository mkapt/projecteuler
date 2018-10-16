package challenges.projecteuler;

import java.util.ArrayList;
import java.util.List;

//6857
public class Problem3 {

    public static void main(String[] args) {
        System.out.println(get(600));
    }

    public static long get(long number) {
        return getLargestPrimeFactor(findPrimeFactors(number));
    }

    public static long getLargestPrimeFactor(List<Long> primeFactorsList) {
        return primeFactorsList.parallelStream().mapToLong(Long::longValue).max().getAsLong();
    }

    public static List<Long> findPrimeFactors(long number) {
        List<Long> list = new ArrayList<>();

        for (long i = 2; i*i < number; i++) {
            if (number % i == 0 && isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isPrime(long number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
