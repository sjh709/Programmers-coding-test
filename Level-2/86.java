class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        for(int i = 0; i <= d; i += k) {
            long xx = (long) Math.pow(i, 2);
            long dd = (long) Math.pow(d, 2);
            
            long maxY = (long) Math.sqrt(dd - xx);
            answer += maxY / k + 1;
        }
        
        return answer;
    }
}
