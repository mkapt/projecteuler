package challenges.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem12 {

    public static void main(String[] args) {
        double inicio = System.currentTimeMillis();
        System.out.println(findHighlyDivisibleNumber(500));
        System.out.println((System.currentTimeMillis() - inicio) / 1000);
    }

    public static long findHighlyDivisibleNumber(int numberOfDivisors) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            long triangularNumber = findNthTriangularNumber(i);
            List<Long> factors = getFactorsOfNumber(triangularNumber);
            long n = findTotalOfDivisors(factors);
            if(n >= numberOfDivisors) {
                return triangularNumber;
            }
        }

        return -1;
    }

    private static long findTotalOfDivisors(List<Long> factors) {

        //Formula for determining the number of divisors of a number d(n)-> d(n) = (a+1)(b+1)(c+1)... (n+1)
        //To use this formula, we need to transform the factored number into an exponential expression
        //Example: 600 -> 2^3 x 3^1 x 5^2. We get the exponents from grouping the number of times each factor shows on the list
        Set<Map.Entry<Long, List<Long>>> exponents = factors
                .stream()
                .collect(Collectors.groupingBy(Function.identity()))
                .entrySet();

        long totalOfDivisors = 1;
        //getting the exponents
        for (Map.Entry<Long, List<Long>> exponent : exponents) {
            //applying the formula (a+1)(b+1)(c+1)... (n+1) to get the total of divisors
            totalOfDivisors = totalOfDivisors * (exponent.getValue().size() + 1);
        }

        return totalOfDivisors;
    }

    private static List<Long> getFactorsOfNumber(long number) {
        List<Long> factorsList = new ArrayList<>();
        long n = number;

        for (long primeFactor = 2; n > 1;) {
            if(n % primeFactor == 0) {
                n = n / primeFactor;
                factorsList.add(primeFactor);
            } else {
                primeFactor++;
                continue;
            }
        }

        return factorsList;
    }

    private static long findNthTriangularNumber(long nthNumber) {
        return nthNumber * (nthNumber + 1) / 2;
    }
}
