class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int limit = (t - 1) * m + p;
        int num = 0;
        int turn = p;
        
        while(sb.length() < limit){
            String s = Integer.toString(num++, n);
            sb.append(s);
        }
        
        for(int i = 0; i < limit; i++){
            if(i + 1 == turn){
                answer += sb.charAt(i);
                turn += m;
            }
        }
        
        return answer.toUpperCase();
    }
}
