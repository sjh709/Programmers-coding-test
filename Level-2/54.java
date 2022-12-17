class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        if(s.length() == 1) return 1;
        
        for(int i = 1; i <= s.length() / 2; i++) {
            String str = "";
            String temp = "";
            int count = 1;
            
            for(int j = 0; j < s.length() / i; j++) {
                if(temp.equals(s.substring(i * j, i * j + i))) {
                    count++;
                    continue;
                }
                
                if(count > 1) {
                    str += count + temp;
                    count = 1;
                }else {
                    str += temp;
                }
                
                temp = s.substring(i * j, i * j + i);
            }
            
            if(count > 1) {
                str += count + temp;
            }else {
                str += temp;
            }
            
            if(s.length() % i != 0) {
                str += s.substring((s.length() / i) * i, s.length());
            }
            
            answer = Math.min(answer, str.length());
        }
        
        return answer;
    }
}
