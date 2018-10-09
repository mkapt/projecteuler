package challenges.projecteuler;

public class Problem5 {

    public static void main(String[] args) {
        //232792560
        System.out.println(findTheSmallestNumber(1, 20));
    }

    private static int findTheSmallestNumber(int from, int to) {

        int i = Integer.MAX_VALUE;
        int smallestValue = Integer.MAX_VALUE;
        for (; i > 0; i--) {
            if(isDivisible(i, from, to)) {
                if(i < smallestValue) smallestValue = i;
            }
        }

        return smallestValue;
    }

    private static boolean isDivisible(int number, int from, int to) {
        for (int i = from; i <= to; i++) {
            if(number % i != 0) {
                return false;
            }
        }

        return true;
    }
}
