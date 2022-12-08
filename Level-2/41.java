import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++) {
            q.offer(scoville[i]);
        }
        
        int idx = 1;
        while(true) {
            boolean check = false;
            if(q.peek() < K) check = true;
            if(!check) {
                answer = idx - 1;
                break;
            }else {
                if(q.size() == 1) {
                    answer = -1;
                    break;
                }
                int f = q.poll();
                int s = q.poll();
                q.offer(f + (s * 2));
            }
            idx++;
        }
        
        return answer;
    }
}
