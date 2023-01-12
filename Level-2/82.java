import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < topping.length; i++) {
            int now = topping[i];
            
            set.add(now);
            
            if(map.get(now) == 1) {
                map.remove(now);
            }else {
                map.put(now, map.get(now) - 1);
            }
            
            if(map.size() == set.size()) answer++;
        }
        
        return answer;
    }
}
