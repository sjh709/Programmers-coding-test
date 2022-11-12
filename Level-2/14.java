import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        long fac = 1;
        for(int i = 1; i <= n; i++){
            list.add(i);
            fac *= i;
        }
        int idx = 0;
        k--;
        while(true){
            fac /= (n - idx);
            long value = k / fac;
            answer[idx++] = list.get((int)value);
            list.remove((int)value);
            if(idx == n - 1) break;
            k %= fac;
        }
        answer[idx] = list.get(0);
        return answer;
    }
}
