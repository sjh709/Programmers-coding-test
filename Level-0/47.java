class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == 'a') continue;
            if(my_string.charAt(i) == 'e') continue;
            if(my_string.charAt(i) == 'i') continue;
            if(my_string.charAt(i) == 'o') continue;
            if(my_string.charAt(i) == 'u') continue;
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
