class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] temp = new int[199];
        for(int i = 0; i < lines.length; i++){
            int max = Math.max(lines[i][0], lines[i][1]);
            int min = Math.min(lines[i][0], lines[i][1]);
            for(int j = min; j < max; j++){
                temp[j + 99]++;
            }
        }
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i] > 1) answer++;
        }
        
        return answer;
    }
}
