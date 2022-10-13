class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int n = Math.abs(sides[1] - sides[0]);
        int m = sides[0] + sides[1];
        for(int i = n + 1; i < m; i++){
            answer++;
        }
        return answer;
    }
}
