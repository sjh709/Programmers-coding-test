class Solution {
    
    public int[][] matrix;
    public int zero, one;
    
    public void find(int size, int row, int col) {
        int num = 0;
        
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(i == row && j == col) num = matrix[i][j];
                if(matrix[i][j] != num) {
                    find(size / 2, row, col);
                    find(size / 2, row, col + size / 2);
                    find(size / 2, row + size / 2, col);
                    find(size / 2, row + size / 2, col + size / 2);
                    
                    return;
                }
            }
        }
        
        if(matrix[row][col] == 0) zero++;
        else one++;
        
        return;
    }
    
    public int[] solution(int[][] arr) {
        matrix = arr;
        
        find(arr.length, 0, 0);
        
        int[] answer = new int[] {zero, one};
        
        return answer;
    }
}
