function countWellFormedParenthesis(n) {
    const dp = new Array(n + 1).fill(0);
    dp[0] = 1;

    for (let i = 1; i <= n; i++) {
        for (let j = 0; j < i; j++) {
            dp[i] += dp[j] * dp[i - 1 - j];
        }
    }
    console.log(dp[n])
    return dp[n];
}

module.exports = countWellFormedParenthesis;