class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            int a = (storey / 10) % 10; // 십의자리
            int b = storey % 10; // 일의자리
            
            if(b > 5) {
                answer += 10 - b;
                storey += 10 - b;
            }
            
            if(b == 5) {
                if(a >= 5) {
                    answer += b;
                    storey += b;
                }else {
                    answer += b;
                    storey -= b;
                }
            }
            
            if(b < 5) {
                answer += b;
                storey -= b;
            }
            
            storey /= 10;
        }
        
        return answer;
    }
}
