class Solution {
    public int minNumber(int a, int b, int c){
        int min = Math.min(a, Math.min(b, c));
        return min;
    }
    
    public int solution(int[][] board) {
        int answer = 0;

        int width = board.length;
        int height = board[0].length;
        int[][] dp = new int[width][height];
        
        for(int i = 0; i < width; i++) dp[i][0] = board[i][0];
        for(int i = 0; i < height; i++) dp[0][i] = board[0][i];
        
        for(int i = 1; i < width; i++){
            for(int j = 1; j < height; j++){
                if(board[i][j] == 1){
                    dp[i][j] = minNumber(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1;
                }
            }
        }
        
        int max = 0;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                if(max < dp[i][j]){
                    max = dp[i][j];
                }
            }
        }
        
        answer = max * max;

        return answer;
    }
}
