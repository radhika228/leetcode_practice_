//leetcode 1411
class Solution {
    private static final int MOD = 1_000_000_007;
    public int numOfWays(int n) {
        long cA = 6;
        long cB = 6;
        for(int i =2;i<=n;i++){
            long newcA =  (2*cA +2*cB)%MOD;
            long newcB = (2*cA +3*cB)%MOD;
            cA=newcA;
            cB=newcB;

        }
        return (int)((cA+cB)%MOD);
        
    
        
    }
}