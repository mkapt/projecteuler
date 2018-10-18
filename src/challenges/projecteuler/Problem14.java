package challenges.projecteuler;

public class Problem14 {

    //837799
    public static void main(String[] args) {
        double i = System.currentTimeMillis();
        findLongestChain();
        System.out.println((System.currentTimeMillis() - i) / 1000);
    }

    private static long generateChain(long number) {
        long n = number, count = 1;

        while(n > 1) {
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;

            count++;
        }

        return count;
    }

    public static void findLongestChain() {
        int size = -1, longest = -1;
        for (int i = 999_999; i >= 2; i--) {
            long t = generateChain(i);
            if (t > size) {
                size = (int) t;
                longest = i;
            }
        }

        System.out.println(longest);
    }
}
