import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(k);
        
        while(k > 1) {
            if(k % 2 == 0) k /= 2;
            else k = (k * 3) + 1;
            list.add(k);
        }
        
        double[] area = new double[list.size() - 1];
        
        for(int i = 0; i < area.length; i++) {
            int a = list.get(i);
            int b = list.get(i + 1);
            
            area[i] = Math.min(a, b) + Math.abs(a - b) / 2.0;
        }
        
        for(int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = ranges[i][1];
            
            end += area.length;
            
            if(start > end) {
                answer[i] = -1;
                continue;
            }
            
            for(int j = start; j < end; j++) {
                answer[i] += area[j];
            }
        }
        
        return answer;
    }
}
