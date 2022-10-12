class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 1; i <= cipher.length() / code; i++){
            char c = cipher.charAt(i * code - 1);
            answer += String.valueOf(c);
        }
        return answer;
    }
}
