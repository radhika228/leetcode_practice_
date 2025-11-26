 //leetcode 509
 class fibonacci {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int total=fnm1+fnm2;
        return total;
        
    }
}
