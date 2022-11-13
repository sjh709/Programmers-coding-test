import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        ArrayList<Integer> alist = new ArrayList<Integer>();
        ArrayList<Integer> blist = new ArrayList<Integer>();
        
        for(int i : A) alist.add(i);
        for(int i : B) blist.add(i);
        
        Collections.sort(alist, Collections.reverseOrder());
        Collections.sort(blist, Collections.reverseOrder());
        
        int idx = 0;
        if(alist.get(0) < blist.get(0)){
            while(true){
                idx = alist.size();
                if(idx == 0) break;
                answer += (alist.get(idx - 1) * blist.get(0));
                alist.remove(idx - 1);
                blist.remove(0);
            }
        }else{
            while(true){
                idx = blist.size();
                if(idx == 0) break;
                answer += (alist.get(0) * blist.get(idx - 1));
                alist.remove(0);
                blist.remove(idx - 1);
            }
        }

        return answer;
    }
}
