class Solution {
    public int answer;
    public void dfs(int[] map, int cnt, int n){
        if(cnt == n){
            answer++;
            return;
        }else{
            for(int i = 0; i < n; i++){
                boolean check = true;
                map[cnt] = i;
                for(int j = 0; j < cnt; j++){
                    if(map[j] == map[cnt]){
                        // 열이 같음
                        check = false;
                        break;
                    }
                    if(Math.abs(map[j] - map[cnt]) == Math.abs(j - cnt)){
                        // 대각선에 있음
                        check = false;
                        break;
                    }
                }
                if(check){
                    dfs(map, cnt + 1, n);
                }
            }
        }
    }
    public int solution(int n) {
        int[] map = new int[n];
        for(int i = 0; i < n; i++){
            map[0] = i;
            dfs(map, 1, n);
        }
        return answer;
    }
}
