class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int empty = 0;
        while(true){
            empty += n % a;
            n = (n / a) * b;
            answer += n;
            if(n < a){
                if(n + empty >= a){
                    n += empty;
                    empty = 0;
                }else{
                    break;
                }
            }
        }
        return answer;
    }
}
