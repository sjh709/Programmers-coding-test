class Solution {
    
    public int[][] map;
    
    public int check(int x1, int y1, int x2, int y2) {
        int min = Integer.MAX_VALUE;
        int temp = map[x1][y1];
        int temp_imsi = 0;
        
        // 오른쪽
        for(int i = y1 + 1; i <= y2; i++) {
            temp_imsi = map[x1][i];
            map[x1][i] = temp;
            temp = temp_imsi;
            
            min = Math.min(min, temp);
        }
        
        // 아래
        for(int i = x1 + 1; i <= x2; i++) {
            temp_imsi = map[i][y2];
            map[i][y2] = temp;
            temp = temp_imsi;
            
            min = Math.min(min, temp);
        }
        
        // 왼쪽
        for(int i = y2 - 1; i >= y1; i--) {
            temp_imsi = map[x2][i];
            map[x2][i] = temp;
            temp = temp_imsi;
            
            min = Math.min(min, temp);
        }
        
        // 위
        for(int i = x2 - 1; i >= x1; i--) {
            temp_imsi = map[i][y1];
            map[i][y1] = temp;
            temp = temp_imsi;
            
            min = Math.min(min, temp);
        }
        
        return min;
    }
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        map = new int[rows][columns];
        int cnt = 0;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                map[i][j] = ++cnt;
            }
        }
        
        for(int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;
            
            int min = check(x1, y1, x2, y2);
            answer[i] = min;
        }
        
        return answer;
    }
}
