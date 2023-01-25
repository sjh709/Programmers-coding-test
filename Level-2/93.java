import java.util.*;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        int[] multiply = {3, 2, 4};
        int[] divide = {2, 1, 3};
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int weight : weights) {
            map.put(weight, map.getOrDefault(weight, 0) + 1);
        }
        
        for(int weight : map.keySet()) {
            long value = map.get(weight);
            answer += (long)(value * (value - 1)) / 2;
            for(int i = 0; i < 3; i++) {
                if(weight % divide[i] != 0) continue;
                int calcWeight = weight / divide[i] * multiply[i];
                if(map.containsKey(calcWeight)){
                    int calcValue = map.get(calcWeight);
                    answer += (long)value * calcValue;
                }
            }
        }
        
        return answer;
    }
}
