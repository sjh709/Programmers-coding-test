import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Integer[] copy = new Integer[emergency.length];
        int[] answer = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++){
            copy[i] = emergency[i];
        }
        Arrays.sort(copy, Collections.reverseOrder());
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < copy.length; j++){
                if(emergency[i] == copy[j]){
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}
