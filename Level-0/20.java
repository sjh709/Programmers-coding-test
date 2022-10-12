class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length - 1; i++){
            int temp = numbers[i] * numbers[i + 1];
            if(temp > answer) answer = temp;
        }
        return answer;
    }
}
