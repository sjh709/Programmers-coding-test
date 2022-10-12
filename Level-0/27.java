class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(String.valueOf(c).equals(letter)) continue;
            else answer += c;
        }
        return answer;
    }
}
