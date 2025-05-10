def countWellFormedParenthesis(nCouples: int) -> int:
    dp = [0] * (nCouples + 1)
    dp[0] = 1

    for i in range(1, nCouples + 1):
        for j in range(i):
            dp[i] += dp[j] * dp[i - 1 - j]

    return dp[nCouples]

if __name__ == "__main__":
    n = 5
    result = countWellFormedParenthesis(n)