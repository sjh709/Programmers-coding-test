import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        for(int i = 0; i < before.length(); i++){
            a.add(after.charAt(i));
            b.add(before.charAt(i));
        }
        Collections.sort(a); Collections.sort(b);
        if(a.equals(b)) answer = 1;
        return answer;
    }
}
