class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                map[i][j] = board[i].charAt(j);
            }
        }
        
        boolean flag = true;
        while(flag){
            flag = false;
            int[][] visited = new int[m][n];
            for(int i = 0; i < m - 1; i++){
                for(int j = 0; j < n - 1; j++){
                    if(map[i][j] == '0') continue;
                    if(map[i][j] == map[i + 1][j] && map[i][j] == map[i][j + 1] && map[i][j] == map[i + 1][j + 1]){
                        visited[i][j] = 1;
                        visited[i + 1][j] = 1;
                        visited[i][j + 1] = 1;
                        visited[i + 1][j + 1] = 1;
                        
                        flag = true;
                    }
                }
            }
            
            for(int j = 0; j < n; j++){
                for(int i = 0; i < m; i++){
                    if(visited[i][j] == 1){
                        answer++;
                        for(int k = i - 1; k >= 0; k--){
                            map[k + 1][j] = map[k][j];
                            map[k][j] = '0';
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}
