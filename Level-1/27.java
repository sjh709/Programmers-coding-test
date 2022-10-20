class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int a = x;
        int sum = 0;
        while(a > 0){
            sum += a % 10;
            a /= 10;
        }
        
        if(x % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}
