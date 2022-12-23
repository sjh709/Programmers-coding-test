import java.util.*;

class Solution {
    public List<Long> operand = new ArrayList<>(); // 숫자
    public List<Character> operator = new ArrayList<>(); // 연산자
    public List<Character> operType = new ArrayList<>(); // 연산자 중복X
    public boolean[] visited;
    public long answer = 0;
    
    public long calculate(long num1, long num2, char op) {
        if(op == '+') {
            return num1 + num2;
        }else if(op == '-') {
            return num1 - num2;
        }else {
            return num1 * num2;
        }
    }
    
    public void dfs(int depth, char[] prio) {
        if(depth == operType.size()) {
            List<Long> numTmp = new ArrayList<>(operand);
            List<Character> operTmp = new ArrayList<>(operator);
            
            for(int i = 0; i < prio.length; i++) {
                for(int j = 0; j < operTmp.size(); j++) {
                    if(prio[i] == operTmp.get(j)) {
                        numTmp.set(j, calculate(numTmp.get(j), numTmp.remove(j + 1), prio[i]));
                        operTmp.remove(j);
                        j--;
                    }
                }
            }
            
            answer = Math.max(answer, Math.abs(numTmp.get(0)));
            
            return;
        }
        
        for(int i = 0; i < operType.size(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                prio[depth] = operType.get(i);
                dfs(depth + 1, prio);
                visited[i] = false;
            }
        }
    }
    
    public long solution(String expression) {
        String[] op = expression.split("\\+|\\-|\\*");
        
        for(String s : op) {
            operand.add(Long.parseLong(s));
        }
        
        for(char ch : expression.toCharArray()) {
            if(ch == '+' || ch == '-' || ch == '*') {
                operator.add(ch);
            }
        }
        
        for(char ch : operator) {
            if(!operType.contains(ch)) {
                operType.add(ch);
            }
        }
        
        visited = new boolean[operType.size()];
        
        dfs(0, new char[operType.size()]);
        
        return answer;
    }
}
