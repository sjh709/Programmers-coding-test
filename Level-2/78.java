import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map;
        for(int i = 0; i <= discount.length - 10; i++) {
            boolean check = true;
            map = new HashMap<>();
            for(int k = 0; k < want.length; k++) {
                map.put(want[k], number[k]);
            }
            
            for(int j = i; j < i + 10; j++) {
                if(map.containsKey(discount[j]) && map.get(discount[j]) > 0) {
                    map.put(discount[j], map.get(discount[j]) - 1);
                }
            }
            
            for(int n : map.values()) {
                if(n != 0) {
                    check = false;
                    break;
                }
            }
            
            if(check) answer++;
        }
        
        return answer;
    }
}
