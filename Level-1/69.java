import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        
        String[] to = today.split("\\.");
        int to_date = ((((Integer.parseInt(to[0]) * 12) + Integer.parseInt(to[1])) * 28) + Integer.parseInt(to[2]));
        
        HashMap<String, Integer> hash = new HashMap<>();
        for(String term : terms) {
            hash.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]) * 28 - 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++) {
            int year = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[0]);
			int month = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[1]);
			int date = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[2]);
            
            int p_date = ((((year * 12) + month) * 28) + date) + hash.get(privacies[i].split(" ")[1]);
            
            if(p_date < to_date) {
                list.add(i + 1);
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
