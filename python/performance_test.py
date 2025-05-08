import time
from main import countWellFormedParenthesis

start = time.time()
result = countWellFormedParenthesis(15)
end = time.time()

print(f"Result: {result}")
print(f"Execution time: {end - start:.5f} seconds")