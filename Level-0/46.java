class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int f = 1;
        while(true){
            num++;
            f *= num;
            if(f <= n) answer = num;
            if(f > n) break;
        }
        return answer;
    }
}
