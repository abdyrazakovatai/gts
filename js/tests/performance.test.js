const count = require('../countWellFormedParenthesis');

test('Performance for n = 15', () => {
    const start = Date.now();
    const result = count(15);
    const end = Date.now();
    const duration = end - start;

    console.log(`Execution time for n=15: ${duration} ms`);
    expect(result).toBeGreaterThan(0);
    expect(duration).toBeLessThan(200); // 200 ms предел
});