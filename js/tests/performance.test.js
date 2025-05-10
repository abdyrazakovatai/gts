const { performance } = require('perf_hooks');
const count = require('../countWellFormedParenthesis');

test('performance test for n=15', () => {
    const n = 15;
    const start = performance.now();
    const result = count(n);
    const end = performance.now();

    console.log(`Result: ${result}`);
    console.log(`Execution time: ${(end - start).toFixed(3)} ms`);

});