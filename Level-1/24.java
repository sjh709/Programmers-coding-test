class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int largeVal;
        if(n < m){
            largeVal = m;
        }else{
            largeVal = n;
        }
        
        for(int i = largeVal; 1 < largeVal; i--){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
                answer[1] = n * m / i;
                break;
            }
        }
        
        return answer;
    }
}
