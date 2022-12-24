class Solution {
    public int[] solution(int n) {
        int[] answer;
        int[][] map = new int[n][n];
        int num = 0;
        int x = -1;
        int y = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i % 3 == 0) {
                    x++;
                }else if(i % 3 == 1) {
                    y++;
                }else if(i % 3 == 2) {
                    x--;
                    y--;
                }
                map[x][y] = ++num;
            }
        }
        
        answer = new int[num];
        int idx = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] != 0) {
                    answer[idx++] = map[i][j];
                }
            }
        }
        
        return answer;
    }
}
