import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < moves.length; i++){
            int n = moves[i] - 1;
            for(int j = 0; j < board.length; j++){
                if(board[j][n] != 0){
                    list.add(idx, board[j][n]);
                    if(idx > 0 && (list.get(idx) == list.get(idx - 1))){
                        list.remove(idx);
                        list.remove(idx - 1);
                        answer += 2;
                    }
                    idx = list.size();
                    board[j][n] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
