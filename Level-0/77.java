class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 97 && c <=122){
                answer += String.valueOf(c).toUpperCase();
            }else if(c >= 65 && c <= 90){
                answer += String.valueOf(c).toLowerCase();
            }
        }
        return answer;
    }
}
