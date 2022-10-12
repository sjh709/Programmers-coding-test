import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] cnt = new int[26];
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) - 97;
            cnt[c]++;
        }
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == 1) answer += (char)(i + 97);
        }
        return answer;
    }
}
