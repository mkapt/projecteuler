package challenges.projecteuler;

//A palindromic number reads the same both ways.
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class Problem4 {

    public static void main(String[] args) {
        //906609
        System.out.println(getLargestPalindrome(999,999));
    }

    private static int getLargestPalindrome(int n1, int n2) {
        int largestValue = 0;

        for (int i = n1; i >= 10; i--) {
            for (int j = n2; j >= 10; j--) {
                int product = i * j;
                if(isPalindromic(product) && product > largestValue) {
                    largestValue = product;
                }
            }
        }

        return largestValue;
    }

    private static boolean isPalindromic(int number) {
        String n = String.valueOf(number);
        for (int i = 0, j = n.length()-1; i <= j; i++, j--) {
            if(n.charAt(i) != n.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
