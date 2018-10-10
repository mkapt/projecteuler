package test;

import challenges.projecteuler.Problem10;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem10Test {

    @Test
    public void up_To_10_Should_Return_17() {
        assertEquals(17, Problem10.getSumOfPrimes(10));
    }

    @Test
    public void up_to_1_Million_Should_Return_37550402023() {
        assertEquals(37550402023L, Problem10.getSumOfPrimes(1_000_000));
    }

    @Test
    public void up_to_2_Million_Should_Return_142913828922() {
        assertEquals(142913828922L, Problem10.getSumOfPrimes(2_000_000));
    }
}
