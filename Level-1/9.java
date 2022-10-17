import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
