import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] num = new String[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            num[i] = String.valueOf(s.charAt(i));
        }
        
        Arrays.sort(num, Collections.reverseOrder());
        
        s = "";
        for(int i = 0; i < num.length; i++){
            s += num[i];
        }
        
        answer = Long.parseLong(s);
        
        return answer;
    }
}
