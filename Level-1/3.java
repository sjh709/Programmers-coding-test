class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        if(len % 2 == 1){
            answer = String.valueOf(s.charAt(len / 2));
        }else{
            for(int i = len / 2 - 1; i <= len / 2; i++){
                answer += s.charAt(i);
            }
        }
        
        return answer;
    }
}
