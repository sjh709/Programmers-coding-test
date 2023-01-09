import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        
        boolean[] visit = new boolean[cards.length];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < cards.length; i++) {
            int index = i;
            int count = 0;
            while(true) {
                if(!visit[index]) {
                    visit[index] = true;
                    index = cards[index] - 1;
                    count++;
                }else {
                    arr.add(count);
                    break;
                }
            }
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        
        answer = arr.get(0) * arr.get(1);
        
        return answer;
    }
}
