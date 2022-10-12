class Solution {
    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) + 49;
            answer += (char)c;
        }
        return answer;
    }
}
