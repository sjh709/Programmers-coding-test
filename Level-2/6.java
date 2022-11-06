class Solution {
    public int solution(int n) {
        int answer = 0;
        long[] d = new long[n + 1];
        d[0] = 1;
        d[2] = 3;
        for(int i = 4; i <= n; i += 2){
            d[i] = d[i - 2] * 3;
            for(int j = i - 4; j >= 0; j -= 2){
                d[i] += d[j] * 2;
            }
            d[i] %= 1000000007;
        }
        answer = (int)d[n];
        return answer;
    }
}
