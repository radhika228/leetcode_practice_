//leetcode 1411
class Solution {
    private static final int MOD = 1_000_000_007;

    public int numOfWays(int n) {
        long countA = 6; // 3 different colors in a row
        long countB = 6; // 2 colors alternating in a row

        for (int i = 2; i <= n; i++) {
            long newA = (2 * countA + 2 * countB) % MOD;
            long newB = (2 * countA + 3 * countB) % MOD;
            countA = newA;
            countB = newB;
        }

        return (int) ((countA + countB) % MOD);
    }
}
