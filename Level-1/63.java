import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length - 1; i >= m - 1; i -= m) {
            int min = Integer.MAX_VALUE;
            for(int j = i; j > i - m; j--) {
                min = Math.min(min, score[j]);
            }
            answer += min * m;
        }
        
        return answer;
    }
}
