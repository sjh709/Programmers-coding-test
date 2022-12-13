import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        HashMap<String, String> userId = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < record.length; i++) {
            String[] s = record[i].split(" ");
            if(s.length > 2) {
                userId.put(s[1], s[2]);
            }
        }
        
        for(int i = 0; i < record.length; i++) {
            String[] s = record[i].split(" ");
            if(s[0].charAt(0) == 'E') {
                list.add(userId.get(s[1]) + "님이 들어왔습니다.");
            }else if(s[0].charAt(0) == 'L') {
                list.add(userId.get(s[1]) + "님이 나갔습니다.");
            }else {
                continue;
            }
        }
        
        answer = new String[list.size()];
        
        list.toArray(answer);
        
        return answer;
    }
}
