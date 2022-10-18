class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') answer += " ";
            else{
                char c = s.charAt(i);
                if(c >= 'A' && c <= 'Z'){
                    c += n;
                    if((int)c > 90) c -= 26;
                }else if(c >= 'a' && c <= 'z'){
                    c += n;
                    if((int)c > 122) c -= 26;
                }
                answer += c;
            }
        }
        return answer;
    }
}
