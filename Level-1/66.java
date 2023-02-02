class Solution {
    public int solution(String s) {
        int answer = 1;
        
        char x = s.charAt(0);
        int x_cnt = 1;
        int c_cnt = 0;
        
        for(int i = 1; i < s.length(); i++) {
            if(x_cnt == c_cnt) {
                x = s.charAt(i);
                x_cnt = 0;
                c_cnt = 0;
                answer++;
            }
            char c = s.charAt(i);
            if(x == c) {
                x_cnt++;
            }else {
                c_cnt++;
            }
        }
        
        return answer;
    }
}
