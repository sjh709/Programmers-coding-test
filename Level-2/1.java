class Solution {
    public int area, cnt;
    public boolean[][] visited;
    public int[] dx = {0, 0, -1, 1};
    public int[] dy = {-1, 1, 0, 0};
    
    public void dfs(int x, int y, int m, int n, int[][] picture){
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
            if(picture[nx][ny] == 0) continue;
            if(visited[nx][ny]) continue;
            if(picture[x][y] != picture[nx][ny]) continue;
            cnt += 1;
            dfs(nx, ny, m, n, picture);
        }
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        visited = new boolean[m][n];
        int max = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(picture[i][j] != 0 && !visited[i][j]){
                    area += 1;
                    cnt = 1;
                    dfs(i, j, m, n, picture);
                    max = Math.max(max, cnt);
                }
            }
        }
        
        answer = new int[]{area, max};
        
        return answer;
    }
}
