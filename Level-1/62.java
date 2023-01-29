class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        String s = "";
        for(int i = 1; i < food.length; i++) {
            int n = food[i] / 2;
            s += String.valueOf(i).repeat(n);
        }
        
        answer = s + "0";
        for(int i = s.length() - 1; i >= 0; i--) {
            answer += s.charAt(i);
        }
        
        return answer;
    }
}
