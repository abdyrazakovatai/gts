import time
from main import countWellFormedParenthesis
n = 15
start = time.perf_counter()
result = countWellFormedParenthesis(n)
end = time.perf_counter()

print(f"Result: {result}")
print(f"Execution time: {(end - start)*1000:.3f} ms")