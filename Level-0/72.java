import java.util.*;
class Solution {
    public String solution(String my_string) {
        ArrayList list = new ArrayList();
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(list.contains(c)) continue;
            list.add(c);
        }
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}
