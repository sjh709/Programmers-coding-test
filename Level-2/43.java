import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : citations) {
            list.add(i);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < list.size(); i++) {
            int n = i + 1;
            int m = list.get(i);
            if(n > m) {
                break;
            }else {
                answer = n;
            }
        }
        
        return answer;
    }
}
