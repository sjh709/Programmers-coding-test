class Solution {
    public int[] dp;
    public int solution(int n) {
        dp = new int[n + 1];
        int answer = fibo(n);
        return answer;
    }
    
    public int fibo(int x){
        if(x == 0 || x == 1) return x;
        if(dp[x] != 0) return dp[x];
        dp[x] = fibo(x - 1) + fibo(x - 2);
        dp[x] %= 1234567;
        return dp[x];
    }
}
