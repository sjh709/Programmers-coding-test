class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double n = (double) num1 / num2 * 1000;
        answer = (int) n;
        return answer;
    }
}
