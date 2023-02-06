class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int tlen = t.length();
        int plen = p.length();
        
        for(int i = 0; i <= tlen - plen; i++) {
            Long num = Long.parseLong(t.substring(i, i + plen));
            if(num <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}
