class noOfSubstringWithOnlyOne {
    public int numSub(String s) {
        long count1s = 0;  
        long ans = 0;     
        long MOD = 1000000007; 

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                count1s++;          
                ans = (ans + count1s) % MOD; 
            } else {
                count1s = 0;        
            }
        }
        return (int) ans;
    }
}
