class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[][] cost = new int[N][N]; // 지역마다 이동하는 시간
        int[] d = new int[N]; // 다익스트라 알고리즘 - d[i]는 i번째 마을까지 걸리는 시간
        boolean[] visited = new boolean[N]; // 방문처리
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                cost[i][j] = 1000000;
            }
        }
        
        for(int i = 0; i < road.length; i++){
            if(cost[road[i][0] - 1][road[i][1] - 1] > road[i][2]){
                cost[road[i][0] - 1][road[i][1] - 1] = road[i][2];
                cost[road[i][1] - 1][road[i][0] - 1] = road[i][2];
            }
        }
        
        for(int i = 1; i < N; i++){
            d[i] = -1;
        }
        
        while(true){
            // 모든 지역 방문했으면 break;
            boolean check = true;
            for(int i = 0; i < N; i++){
                if(!visited[i]) check = false;
            }
            if(check) break;
            
            int min = Integer.MAX_VALUE;
            int min_idx = -1;
            for(int i = 0; i < N; i++){
                if(d[i] >= 0 && !visited[i] && d[i] < min){
                    min = d[i];
                    min_idx = i;
                }
            }
            
            for(int i = 0; i < N; i++){
                if(i == min_idx) continue;
                if(d[i] == -1 || d[min_idx] + cost[min_idx][i] < d[i]){
                    d[i] = d[min_idx] + cost[min_idx][i];
                }
            }
            
            visited[min_idx] = true;
        }
        
        for(int i = 0; i < N; i++){
            if(d[i] <= K) answer++;
        }

        return answer;
    }
}
