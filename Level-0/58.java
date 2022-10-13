class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[x].length; y++){
                if(board[x][y] == 1){
                    for(int i = 0; i < 8; i++){
                        int nx = x + dx[i];
                        int ny = y + dy[i];
                        if(nx < 0 || ny < 0 || nx >= board.length || ny >= board.length) continue;
                        if(board[nx][ny] != 0) continue;
                        board[nx][ny] = board[x][y] + 1;
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}
