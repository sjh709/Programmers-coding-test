import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        Stack<Integer> scores = new Stack<>();
        int start_idx = 0;
        
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if(c == 'S' || c == 'D' || c == 'T') {
                int num = Integer.parseInt(dartResult.substring(start_idx, i));
                scores.add((int) Math.pow(num, c == 'S' ? 1 : c == 'D' ? 2 : 3));
            }else if(c == '#') {
                int a = scores.pop();
                scores.add(a * (-1));
            }else if(c == '*') {
                int a = scores.pop();
                if(!scores.isEmpty()) {
                    int b = scores.pop();
                    scores.add(b * 2);
                }
                scores.add(a * 2);
            }
            
            if(c < '0' || c > '9') start_idx = i + 1;
        }
        
        while(!scores.isEmpty()) {
            answer += scores.pop();
        }
        
        return answer;
    }
}
