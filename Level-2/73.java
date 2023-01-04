class Solution {
    
    public boolean[] visit;
    public int answer;
    
    public void backTracking(int depth, int k, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(!visit[i] && dungeons[i][0] <= k) {
                visit[i] = true;
                backTracking(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visit = new boolean[dungeons.length];
        
        backTracking(0, k, dungeons);
        
        return answer;
    }
}
