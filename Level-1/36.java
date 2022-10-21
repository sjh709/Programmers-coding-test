import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < participant.length; i++){
            String name = participant[i];
            if(map.containsKey(name)){
                int cnt = map.get(name);
                map.put(name, ++cnt);
            }else{
                map.put(name, 1);
            }
        }
        
        for(int i = 0; i < completion.length; i++){
            String name = completion[i];
            int cnt = map.get(name);
            map.put(name, --cnt);
        }
        
        for(String name : map.keySet()){
            if(map.get(name) != 0) answer = name;
        }
        
        return answer;
    }
}
