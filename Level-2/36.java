import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                int num = map.get(clothes[i][1]);
                map.put(clothes[i][1], ++num);
            }else{
                map.put(clothes[i][1], 1);
            }
        }
        
        if(map.size() > 1){
            for(String s : map.keySet()){
                answer *= map.get(s) + 1;
            }
            answer -= 1;
        }else{
            for(String s : map.keySet()){
                answer = map.get(s);
            }
        }
        
        return answer;
    }
}
