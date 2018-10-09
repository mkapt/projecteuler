package challenges.projecteuler;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
public class Problem7 {

    public static void main(String[] args) {
        System.out.println(getNthValue(10_000));
    }

    private static int getNthValue(int value) {
        int quantityOfPrimeNumbersFound = 0;

        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                quantityOfPrimeNumbersFound++;
            }

            if(quantityOfPrimeNumbersFound == value) {
                return i;
            }
        }

        return -1;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
