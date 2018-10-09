package challenges.projecteuler;

import java.math.BigInteger;

//The Fibonacci sequence is defined by the recurrence relation:
//
//Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
//Hence the first 12 terms will be:
//
//F1 = 1
//F2 = 1
//F3 = 2
//F4 = 3
//F5 = 5
//F6 = 8
//F7 = 13
//F8 = 21
//F9 = 34
//F10 = 55
//F11 = 89
//F12 = 144
//The 12th term, F12, is the first term to contain three digits.
//
//What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
public class Problem25 {

    public static void main(String[] args) {
        System.out.println(getNumber(1000));
    }

    private static int getNumber(int numberOfDigits) {
        BigInteger previous = new BigInteger("0");
        BigInteger next = new BigInteger("1");
        BigInteger sum = previous.add(next);

        for (int i = 1;;i++) {
            if(String.valueOf(next).length() == numberOfDigits) return i;
            previous = next;
            next = sum;
            sum = previous.add(next);
        }
    }
}
