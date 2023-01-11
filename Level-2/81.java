import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        int idx = 0;
        for(int i = 1; i <= order.length; i++) {
            if(order[idx] != i) {
                stack.add(i);
                continue;
            }
            answer++;
            idx++;
            
            while(stack.size() != 0 && order[idx] == stack.peek()) {
                answer++;
                idx++;
                stack.pop();
            }
        }
        
        return answer;
    }
}
