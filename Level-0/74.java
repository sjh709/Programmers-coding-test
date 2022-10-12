class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i] - n) < min){
                min = Math.abs(array[i] - n);
                answer = array[i];
            }
            if(Math.abs(array[i] - n) == min){
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}
