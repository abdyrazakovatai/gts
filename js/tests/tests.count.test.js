const count = require('../countWellFormedParenthesis');

test('n = 1', () => {
    expect(count(1)).toBe(1);
});

test('n = 3', () => {
    expect(count(3)).toBe(5);
});

test('n = 5', () => {
    expect(count(5)).toBe(42);
});