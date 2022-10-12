class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < k; i++){
            if(cnt >= numbers.length) cnt -= numbers.length;
            if(i == k - 1) answer = numbers[cnt];
            cnt += 2;
        }
        return answer;
    }
}
