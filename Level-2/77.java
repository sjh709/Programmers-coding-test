import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long total = 0;
        long total_q1 = 0;
        long total_q2 = 0;
        
        for(int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            total_q1 += queue1[i];
        }
        
        for(int i = 0; i < queue2.length; i++) {
            q2.add(queue2[i]);
            total_q2 += queue2[i];
        }
        
        total = total_q1 + total_q2;
        
        if(total % 2 != 0) return -1;
        
        total /= 2;
        
        while(true) {
            if(answer > (q1.size() + q2.size()) * 2) return -1;
            if(total_q1 < total) {
                int q = q2.poll();
                q1.add(q);
                total_q1 += q;
                total_q2 -= q;
            }else if(total_q1 > total) {
                int q = q1.poll();
                q2.add(q);
                total_q1 -= q;
                total_q2 += q;
            }else {
                break;
            }
            answer++;
        }
        
        return answer;
    }
}
