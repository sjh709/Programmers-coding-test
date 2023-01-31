class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] arr = new int[number + 1];
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    if(i / j == j) {
                        arr[i]++;
                    }else {
                        arr[i] += 2;
                    }
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > limit) {
                answer += power;
            }else {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}
