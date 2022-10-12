class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a <= j; a++){
            String num = String.valueOf(a);
            for(int b = 0; b < num.length(); b++){
                int n = num.charAt(b) - '0';
                if(n == k) answer++;
            }
        }
        return answer;
    }
}
