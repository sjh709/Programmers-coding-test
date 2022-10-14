import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        Arrays.fill(answer, 1);
        for(int i = 0; i < avg.length; i++){
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        for(int i = 0; i < avg.length; i++){
            for(int j = 0; j < avg.length; j++){
                if(i == j) continue;
                if(avg[i] > avg[j]) answer[j]++;
            }
        }
        
        return answer;
    }
}
