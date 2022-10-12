class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String s = String.valueOf(num);
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) - '0';
            if(c == k){
                answer = i + 1;
                break;
            }
        }
        if(answer == 0) answer = -1;
        return answer;
    }
}
