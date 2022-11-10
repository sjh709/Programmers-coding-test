class Solution {
    
    public int check(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0 && n / i <= 10000000){
                return n / i;
            }
        }
        return 1;
    }
    
    public int[] solution(long begin, long end) {
        int b = (int)begin;
        int e = (int)end;
        
        int[] answer = new int[e - b + 1];
        
        for(int i = b; i <= e; i++){
            if(i == 1) answer[i - b] = 0;
            else answer[i - b] = check(i);
        }
        
        return answer;
    }
}
