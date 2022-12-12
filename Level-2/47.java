class Solution {
    public String solution(String number, int k) {
        String answer = "";
        char max = '0';
        int idx = 0;
        
        for(int i = 0; i < number.length() - k; i++) {
            max = '0';
            for(int j = idx; j <= i + k; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                    if(max == '9') break;
                }
            }
            answer += max;
        }
        
        return answer;
    }
}
