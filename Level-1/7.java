import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i]);
        }
        list.sort((a, b) -> a.charAt(n) == b.charAt(n) ? a.compareTo(b) : a.charAt(n) - b.charAt(n));
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
