import java.util.*;

class Pos {
    long x;
    long y;
    
    Pos(long x, long y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        
        Set<Pos> set = new HashSet<>();
        
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;
        
        for(int i = 0; i < line.length - 1; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];
            
            for(int j = i + 1; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];
                
                // 두 직선이 평행 또는 일치
                long adbc = a * d - b * c;
                if(adbc == 0) continue;
                
                long bfed = b * f - e * d;
                if(bfed % adbc != 0) continue;
                
                long ecaf = e * c - a * f;
                if(ecaf % adbc != 0) continue;
                
                long x = bfed / adbc;
                long y = ecaf / adbc;
                
                set.add(new Pos(x, y));
                
                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
            }
        }
        
        long width = maxX - minX + 1;
        long height = maxY - minY + 1;
        
        answer = new String[(int)height];
        
        String s = "";
        for(int i = 0; i < width; i++) {
            s += ".";
        }
        Arrays.fill(answer, s);
        
        for(Pos p : set) {
            long nx = p.x - minX;
            long ny = maxY - p.y;
            
            answer[(int)ny] = answer[(int)ny].substring(0, (int)nx) + "*" + answer[(int)ny].substring((int)nx + 1);
	                
        }
        
        return answer;
    }
}
