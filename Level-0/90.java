class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        String str = str1.replaceAll(str2, "@");
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '@') answer = 1;
        }
        return answer;
    }
}
