package gts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTest {

    @Test
    public void testOne() {
        assertEquals(1, Count.countWellFormatedParenthesis(1));
    }

    @Test
    public void testThree() {
        assertEquals(5, Count.countWellFormatedParenthesis(3));
    }

    @Test
    public void testFive() {
        assertEquals(42, Count.countWellFormatedParenthesis(5));
    }
}