import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        HashMap<Character, Integer> hash = new HashMap<>();
        int idx = 0;
        for(char c = 'a'; c <= 'z'; c++) {
            if(skip.contains(String.valueOf(c))) continue;
            hash.put(c, idx++);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = hash.get(c) + index;
            while(num >= hash.size()) {
                num -= hash.size();
            }
            list.add(num);
        }
        
        for(int n : list) {
            for(char key : hash.keySet()) {
                int value = hash.get(key);
                if(n == value) {
                    answer += key;
                    break;
                }
            }
        }
        
        return answer;
    }
}
