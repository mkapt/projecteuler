package test;

import challenges.projecteuler.Problem17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem17Test {


    @Test
    public void testUnidade() {
        Assertions.assertEquals("two", Problem17.writeout("2"));
    }

    @Test
    public void testDezena() {
        Assertions.assertEquals("twenty-one", Problem17.writeout("21"));
    }

    @Test
    public void testDezena2() {
        Assertions.assertEquals("twenty", Problem17.writeout("20"));
    }

    @Test
    public void testCentena() {
        Assertions.assertEquals("nine hundred and ninety-nine", Problem17.writeout("999"));
    }

    @Test
    public void testCentena2() {
        Assertions.assertEquals("two hundred", Problem17.writeout("200"));
    }

    @Test
    public void testCentena3() {
        Assertions.assertEquals("nine hundred and ninety-eight", Problem17.writeout("998"));
    }

    @Test
    public void testCentena4() {
        Assertions.assertEquals("three hundred and forty-two", Problem17.writeout("342"));
    }

    @Test
    public void testCentena5() {
        Assertions.assertEquals("one hundred and fifteen", Problem17.writeout("115"));
    }

    @Test
    public void testCentena6() {
        Assertions.assertEquals("one hundred and five", Problem17.writeout("105"));
    }

    @Test
    public void testCentena7() {
        Assertions.assertEquals("nine hundred and seventeen", Problem17.writeout("917"));
    }

    @Test
    public void testMilhar() {
        Assertions.assertEquals("one thousand", Problem17.writeout("1000"));
    }

    @Test
    public void testRemoveChars() {
        Assertions.assertEquals("onethousand", Problem17.removeChars("one thousand"));
    }

    @Test
    public void testRemoveChars2() {
        Assertions.assertEquals("ninehundredandninetyeight", Problem17.removeChars("nine hundred and ninety-eight"));
    }

    @Test
    public void testAnswer() {
        Assertions.assertEquals(21124, Problem17.iterate());
    }
}
