import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        int curr_weight = 0; // 현재 무게
        int idx = 0;
        
        while(idx != truck_weights.length){
            int truck = truck_weights[idx];
            
            if(q.size() == bridge_length){
                curr_weight -= q.poll();
            }else if(curr_weight + truck > weight){
                q.offer(0);
                answer++;
            }else{
                q.offer(truck);
                curr_weight += truck;
                answer++;
                idx++;
            }
        }
        
        return answer + bridge_length;
    }
}
