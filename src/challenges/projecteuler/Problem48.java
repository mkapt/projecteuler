package challenges.projecteuler;

import java.math.BigInteger;

public class Problem48 {
    public static void main(String[] args) {
        System.out.println(get(1000));
        //9110846700
    }

    public static BigInteger get(int seriesEnd) {
        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i <= seriesEnd; i++) {
            sum = sum.add(new BigInteger(String.valueOf(i)).pow(i));
        }

        return sum.remainder(new BigInteger("10000000000"));
    }
}

