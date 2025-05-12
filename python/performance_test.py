import unittest
import time
from main import countWellFormedParenthesis

class PerformanceTest(unittest.TestCase):
    def test_performance(self):
        n = 15
        start = time.perf_counter()
        result = countWellFormedParenthesis(n)
        end = time.perf_counter()

        duration_ms = (end - start) * 1000  # в миллисекундах

        print(f"Result: {result}")
        print(f"Execution time: {duration_ms:.3f} ms")

        self.assertGreater(result,0)
        self.assertLess(duration_ms,200)