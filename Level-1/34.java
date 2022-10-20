import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        for(int i = 0; i < n; i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            s1 = "0".repeat(n - s1.length()) + s1;
            s2 = "0".repeat(n - s2.length()) + s2;
            for(int j = 0; j < n; j++){
                int n1 = s1.charAt(j) - '0';
                int n2 = s2.charAt(j) - '0';
                if(n1 == 0 && n2 == 0){
                    answer[i] += " ";
                }else{
                    answer[i] += "#";
                }
            }
        }
        return answer;
    }
}
