class Solution {
    public int solution(int n) {
        int answer = n;
        
        String num1 = Integer.toBinaryString(n);
        int cnt1 = 0;
        
        for(int i = 0; i < num1.length(); i++){
            if(num1.charAt(i) == '1') cnt1++;
        }
        
        while(true){
            answer += 1;
            String num2 = Integer.toBinaryString(answer);
            int cnt2 = 0;
            for(int i = 0; i < num2.length(); i++){
                if(num2.charAt(i) == '1') cnt2++;
            }
            if(cnt1 == cnt2) break;
        }
        
        return answer;
    }
}
