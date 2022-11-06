class Solution {
    public int[] d;
    public int solution(int n) {
        d = new int[n + 1];
        int answer = fibo(n);
        return answer;
    }
    
    public int fibo(int n){
        if(n == 1 || n == 2) {
            return n;
        }
        if(d[n] != 0){
            return d[n] % 1000000007;
        }
        d[n] = fibo(n - 1) + fibo(n - 2);
        return d[n] % 1000000007;
    }
}
