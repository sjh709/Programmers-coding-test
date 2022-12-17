import java.util.*;

class Pos {
    int x;
    int y;
    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    
    public int[] dir(char c) {
        if(c == 'U') return new int[]{0, 1};
        else if(c == 'D') return new int[]{0, -1};
        else if(c == 'R') return new int[]{1, 0};
        else return new int[]{-1, 0};
    }
    
    public int solution(String dirs) {
        int answer = 0;
        HashSet<String> set = new HashSet<String>();
        Pos p = new Pos(0, 0);
        
        for(int i = 0; i < dirs.length(); i++) {
            int[] arr = dir(dirs.charAt(i));
            
            int nx = p.x + arr[0];
            int ny = p.y + arr[1];
            
            if(nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5) {
                String s1 = String.valueOf(p.x) + String.valueOf(p.y) + String.valueOf(nx) + String.valueOf(ny);
                String s2 = String.valueOf(nx) + String.valueOf(ny) + String.valueOf(p.x) + String.valueOf(p.y);
                set.add(s1);
                set.add(s2);
                
                p.x = nx;
                p.y = ny;
            }
        }
        
        answer = set.size() / 2;
        
        return answer;
    }
}
