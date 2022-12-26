class Solution {
    
    public int cnt = 0;
    public int zero_cnt = 0;
    
    public void check(String s) {
        String temp = "";
        
        if(s.equals("1")) return;
        
        cnt++;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                zero_cnt++;
            }else {
                temp += s.charAt(i);
            }
        }
        
        check(Integer.toBinaryString(temp.length()));
        
    }
    
    public int[] solution(String s) {
        check(s);
        
        int[] answer = new int[] {cnt, zero_cnt};
        
        return answer;
    }
}
