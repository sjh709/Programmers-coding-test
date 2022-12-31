import java.util.*;

class Solution {
    
    public int gridRLen, gridCLen;
    public boolean[][][] visit;
    public char[][] map;
    public int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int search(int r, int c, int d) {
        int count = 0;
        while(true) {
            if(visit[r][c][d]) break;
            visit[r][c][d] = true;
            r = Math.floorMod(r + dir[d][0], gridRLen);
            c = Math.floorMod(c + dir[d][1], gridCLen);
            count++;
            if(map[r][c] == 'R')
                d = Math.floorMod(d + 1, 4);
            else if(map[r][c] == 'L')
                d = Math.floorMod(d - 1, 4);
        }
        
        return count;
    }
    
    public void init(String[] grid) {
        visit = new boolean[gridRLen][gridCLen][4];
        map = new char[gridRLen][gridCLen];
        for(int i = 0; i < gridRLen; i++) {
            for(int j = 0; j < gridCLen; j++) {
                map[i] = grid[i].toCharArray();
            }
        }
    }
    
    public int[] solution(String[] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        
        gridRLen = grid.length;
        gridCLen = grid[0].length();
        
        init(grid);
        for(int r = 0; r < gridRLen; r++) {
            for(int c = 0; c < gridCLen; c++) {
                for(int d = 0; d < 4; d++) {
                    if(visit[r][c][d]) continue;
                    int ret = search(r, c, d);
                    list.add(ret);
                }
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
