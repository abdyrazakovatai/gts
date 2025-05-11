import time
from main import countWellFormedParenthesis

def run_performance_test():
        n = 15
        start = time.perf_counter()
        result = countWellFormedParenthesis(n)
        end = time.perf_counter()

        duration_ms = (end - start) * 1000  # в миллисекундах

        print(f"Result: {result}")
        print(f"Execution time: {duration_ms:.3f} ms")

        assert result > 0
        assert duration_ms < 200  # предел — 200 мс

if __name__ == "__main__":
    run_performance_test()