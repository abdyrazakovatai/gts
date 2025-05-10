package peaksoft.gts.gts_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {
    @Test
    void testPerformance() {
        long start = System.nanoTime();
        int result = Count.countWellFormatedParenthesis(15);
        long end = System.nanoTime();

        System.out.println("Result: " + result);
        System.out.println("Execution time (ms): " + (end - start) / 1_000_000.0);

        assertTrue(end - start < 1_000_000_000); // < 1 сек
    }
}