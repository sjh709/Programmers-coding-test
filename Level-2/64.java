import java.util.*;

class Solution {
    public boolean check(String ss) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.add(c);
            }else {
                if(stack.isEmpty()) return false;
                char cc = stack.peek();
                if((cc == '(' && c == ')') || (cc == '[' && c == ']') || (cc == '{' && c == '}')) stack.pop();
                else return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            boolean chk = false;
            String ss = s.substring(i) + s.substring(0, i);
            chk = check(ss);
            if(chk) answer++;
        }
        
        return answer;
    }
}
