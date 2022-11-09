class Solution {
    int solution(int[][] land) {
        int answer = 0;

        int width = land.length;
        int height = land[0].length;
        
        int[][] dp = new int[width][height];
        
        for(int i = 0; i < height; i++) dp[0][i] = land[0][i];
        
        for(int i = 1; i < width; i++){
            for(int j = 0; j < height; j++){
                for(int k = 0; k < height; k++){
                    if(j != k){
                        dp[i][j] = Math.max(dp[i - 1][k] + land[i][j], dp[i][j]);
                    }
                }
            }
        }
        
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                if(answer < dp[i][j]){
                    answer = dp[i][j];
                }
            }
        }

        return answer;
    }
}
