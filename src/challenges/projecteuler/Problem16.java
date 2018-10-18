package challenges.projecteuler;

import java.math.BigInteger;

public class Problem16 {

    public static void main(String[] args) {
        System.out.println(getSumFunctionalStyle());
        System.out.println(getSum());
    }

    private static int getSum() {
        String result = new BigInteger("2").pow(1000).toString();

        int sum = 0;
        for (int i = 0; i < result.length(); i++)
            sum +=Character.getNumericValue(result.charAt(i));

        return sum;
    }

    //It takes 8 to 10 times longer
    private static int getSumFunctionalStyle() {
        return new BigInteger("2").pow(1000).toString().chars().map(ch -> Character.getNumericValue(ch)).sum();
    }
}
