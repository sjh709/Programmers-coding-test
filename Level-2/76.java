class Solution {
    
    public int[] answer = {-1};
    public int[] need;
    public int max = Integer.MIN_VALUE;
    
    public void dfs(int[] info, int cnt, int n) {
        if(cnt == n + 1) {
            int apeach = 0;
            int ryan = 0;
            
            for(int i = 0; i < 11; i++) {
                if(info[i] != 0 || need[i] != 0) {
                    if(info[i] < need[i])
                        ryan += 10 - i;
                    else
                        apeach += 10 - i;
                }
            }
            
            if(ryan > apeach) {
                if(ryan - apeach >= max) {
                    answer = need.clone();
                    max = ryan - apeach;
                }
            }
            
            return;
        }
        
        for(int i = 0; i < 11 && need[i] <= info[i]; i++) {
            //if(need[i] <= info[i]) { // 시간초과
                need[i]++;
                dfs(info, cnt + 1, n);
                need[i]--;
            //}
        }
    }
    
    public int[] solution(int n, int[] info) {
        need = new int[11];
        
        dfs(info, 1, n);
        
        return answer;
    }
}
