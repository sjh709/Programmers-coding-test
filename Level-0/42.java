class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if(direction.equals("right")){
                if(i - 1 < 0) answer[i] = numbers[i - 1 + numbers.length];
                else answer[i] = numbers[i - 1];
            }
            if(direction.equals("left")){
                if(i + 1 == numbers.length) answer[i] = numbers[0];
                else answer[i] = numbers[i + 1];
            }
        }
        return answer;
    }
}
