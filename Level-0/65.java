import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numlist.length; i++){
            map.put(numlist[i], Math.abs(n - numlist[i]));
        }
        
        ArrayList<Integer> key = new ArrayList<Integer>(map.keySet());
        Collections.sort(key, Collections.reverseOrder());
        key.sort((a, b) -> Math.abs(n - a) - Math.abs(n - b));
        
        for(int i = 0; i < key.size(); i++){
            answer[i] = key.get(i);
        }
        
        return answer;
    }
}
