const { performance } = require('perf_hooks');
const count = require('../countWellFormedParenthesis');

test('Performance test for n = 15', () => {
    const n = 15;
    const start = performance.now();
    const result = count(n);
    const end = performance.now();

    const duration = end - start;

    console.log(`Result: ${result}`);
    console.log(`Execution time: ${duration.toFixed(3)} ms`);

    expect(result).toBeGreaterThan(0);
    expect(duration).toBeLessThan(200); // 200 ms предел
});