import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                if(!list.contains(i)) list.add(i);
                n /= i;
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
