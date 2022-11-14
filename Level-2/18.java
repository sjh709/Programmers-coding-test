class Solution {
    public int[][] answer;
    public int x = 0;
    public void hanoi(int num, int from, int other, int to) {
        if(num == 0) return;
        hanoi(num - 1, from, to, other);
        answer[x][0] = from;
        answer[x++][1] = to;
        hanoi(num - 1, other, from, to);
    }
    public int[][] solution(int n) {
        int size = (int) Math.pow(2, n) - 1;
        answer = new int[size][2];
        hanoi(n, 1, 2, 3);
        return answer;
    }
}
