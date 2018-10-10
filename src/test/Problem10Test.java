package test;

import challenges.projecteuler.Problem10;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem10Test {

    @Test
    public void upTo10ShouldReturn17() {
        assertEquals(17, Problem10.getSumOfPrimes(10));
    }

    @Test
    public void upto1MillionShouldReturn142913828922() {
        assertEquals(37550402023L, Problem10.getSumOfPrimes(1_000_000));
    }
}
