import java.util.*;

class Solution {
    public Comparator<Integer> comb = new Comparator<Integer>() {
        // 비트 1의 개수를 센다
        public int countBits(int n) {
            int ret = 0;
            while(n != 0) {
                if((n & 1) != 0) ret++;
                n = n >> 1;
            }
            return ret;
        }
        
        public int compare(Integer a, Integer b) {
            int x = countBits(a);
            int y = countBits(b);
            if(x > y) {
                return 1;
            }else if(x < y) {
                return -1;
            }else {
                return 0;
            }
        }
    };
    
    public boolean check(String[][] relation, int rowsize, int colsize, int subset) {
        for(int a = 0; a < rowsize - 1; a++) {
            for(int b = a + 1; b < rowsize; b++) {
                boolean isSame = true;
                for(int k = 0; k < colsize; k++) {
                    if((subset & 1 << k) == 0) continue;
                    if(relation[a][k].equals(relation[b][k]) == false) {
                        isSame = false;
                        break;
                    }
                }
                if(isSame) return false;            }
        }
        return true;
    }
    
    public int solution(String[][] relation) {
        int answer = 0;
        int rowsize = relation.length;
        int colsize = relation[0].length;
        List<Integer> candidates = new LinkedList<Integer>();
        
        for(int i = 1; i < 1 << colsize; i++) {
            // 유일성을 만족하는지 확인
            if(check(relation, rowsize, colsize, i) == true) {
                candidates.add(i);
            }
        }
        
        Collections.sort(candidates, comb);
        
        while(candidates.size() != 0) {
            int n = candidates.remove(0);
            answer++;
            for(Iterator<Integer> it = candidates.iterator(); it.hasNext(); ) {
                int c = it.next();
                if((n & c) == n) {
                    it.remove();
                }
            }
        }
        
        return answer;
    }
}
