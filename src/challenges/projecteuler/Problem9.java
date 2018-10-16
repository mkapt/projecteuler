package challenges.projecteuler;

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a*a + b*b = c*c
//For example, 3*3 + 4*4 = 9 + 16 = 25 = 5*5.
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
public class Problem9 {

    public static void main(String[] args) {
        System.out.println(solve(1000));
    }


    //Using the formula to get any Pythagorean triple: a = k(m*m - n*n), b = k(2*m*n), c = k(m*m + n*n)
    //where m, n, k are positive integers, m > n
    //Since every Pythagorean triple can be divided through by some integer k to obtain a primitive triple,
    //every triple can be generated uniquely by using the formula with m and n to generate
    //its primitive counterpart and then multiplying through by k as in the last equation.
    public static int solve(int s) {
        for(int m = 2; m < Integer.MAX_VALUE; m++) {
            for(int n = 1; n < m; n ++) {
                int a = m*m - n*n;
                int b = 2*m*n;
                int c = m*m + n*n;
                if(s % (a+b+c) == 0) {
                    int k = s / (a+b+c);
                    return k*a * k*b * k*c;
                }
            }
        }
        return -1;
    }
}
