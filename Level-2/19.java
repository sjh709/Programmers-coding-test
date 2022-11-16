class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                int count = 0;
                for(int x = 0; x < arr1[0].length; x++){
                    count += arr1[i][x] * arr2[x][j];
                }
                answer[i][j] = count;
            }
        }
        return answer;
    }
}
