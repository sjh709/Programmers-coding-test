class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i <= 9; i++){
            int cnt = 0;
            for(int j = 0; j < numbers.length; j++){
                if(i == numbers[j]) cnt += 1;
            }
            if(cnt == 0) answer += i;
        }
        return answer;
    }
}
