class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] max = new int[2];
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > max[0]) max[0] = sizes[i][0];
            if(sizes[i][1] > max[1]) max[1] = sizes[i][1];
        }
        answer = max[0] * max[1];
        return answer;
    }
}
