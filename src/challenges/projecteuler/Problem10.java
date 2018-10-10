package challenges.projecteuler;

//142913828922
public class Problem10 {

    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(1_000_000));
    }

    public static long getSumOfPrimes(int toTheValue) {
        long sum = 0;

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if(i == toTheValue) return sum;

            if (isPrime(i) && i < toTheValue) {
                sum+=i;
            }
        }

        return -1;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
