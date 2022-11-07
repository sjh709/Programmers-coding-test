import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        if(s.startsWith(")")) return false;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                try{
                    stack.pop();
                }catch(Exception e){
                    return false;
                }
            }
        }
        
        if(!stack.isEmpty()){
            return false;
        }

        return answer;
    }
}
