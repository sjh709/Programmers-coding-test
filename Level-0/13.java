import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                int n = map.get(array[i]);
                map.put(array[i], n + 1);
            }else{
                map.put(array[i], 1);
            }
        }
        
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int k : map.keySet()){
            if(max == map.get(k)){
                cnt++;
            }else if(max < map.get(k)){
                max = map.get(k);
                answer = k;
                cnt = 1;
            }
        }
        
        if(cnt > 1) answer = -1; 
        
        return answer;
    }
}
