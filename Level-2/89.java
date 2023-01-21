import java.util.*;
class Solution {
    public long getCount(long num) {
        int[] fk = new int[] {0, 1, 2, 2, 3, 4};
        
        if(num <= 5) {
            return fk[(int) num];
        }
        
        int level = 1;
        while(num > Math.pow(5, level + 1)) {
            level++;
        }
        
        long q = num / (long) Math.pow(5, level);
        long r = num % (long) Math.pow(5, level);
        
        long count = q * (long) Math.pow(4, level);
        
        if(q == 2) {
            return count;
        }else {
            if(q > 2) {
                count -= Math.pow(4, level);
            }
            count += getCount(r);
        }
        
        return count; 
    }
    
    public int solution(int n, long l, long r) {
        int answer = (int) getCount(r) - (int) getCount(l - 1);
        return answer;
    }
}
