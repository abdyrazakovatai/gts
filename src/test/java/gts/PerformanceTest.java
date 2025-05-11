package gts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {
    @Test
    void testPerformance() {
        long start = System.nanoTime();
        int result = Count.countWellFormatedParenthesis(15);
        long end = System.nanoTime();

        double durationMs = (end - start) / 1_000_000.0;

        System.out.println("Result: " + result);
        System.out.printf("Execution time (ms): %.6f%n", durationMs);

        assertTrue(end - start < 1_000_000); // < 1 миллисекунды (в наносекундах)
    }

}