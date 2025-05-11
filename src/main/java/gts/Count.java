package gts;

public class Count {
    public static int countWellFormatedParenthesis(int n) {

        int[] counts = new int[n + 1];
        counts[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                counts[i] += counts[j] * counts[i - j - 1];
            }
        }
        return counts[n];
    }
}
