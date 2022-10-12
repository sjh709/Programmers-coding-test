import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] s = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                s[i] = String.valueOf(c).toLowerCase();
            }else{
                s[i] = String.valueOf(c);
            }
        }
        Arrays.sort(s);
        for(int i = 0; i < s.length; i++){
            answer += s[i];
        }
        return answer;
    }
}
