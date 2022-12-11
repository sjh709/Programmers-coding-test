class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for(int i = 1; i <= area; i++) {
            int row = i; // 세로
            int col = area / i; // 가로
            
            if(col >= row) {
                if((col - 2) * (row - 2) == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }else {
                break;
            }
        }
        
        return answer;
    }
}
