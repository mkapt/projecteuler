package challenges.projecteuler;

//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Problem6 {

    public static void main(String[] args) {
        System.out.println(findSquareDifference(100));
        //25164150
    }

    private static int findSquareDifference(int to) {

        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= to; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        squareOfSum = squareOfSum * squareOfSum;

        return squareOfSum - sumOfSquares;
    }
}
