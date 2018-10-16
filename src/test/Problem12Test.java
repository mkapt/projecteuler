package test;


import challenges.projecteuler.Problem12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem12Test {

    @Test
    public void test() {
        Assertions.assertEquals(76_576_500, Problem12.findHighlyDivisibleNumber(500));
    }

}
