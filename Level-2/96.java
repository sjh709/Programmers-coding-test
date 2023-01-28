import java.util.*;
class Solution {
    public int n, m, sum;
    public int[][] arr;
    public boolean[][] visited;
    public int[] dx = {-1, 1, 0, 0};
    public int[] dy = {0, 0, -1, 1};
    public void dfs(int x, int y) {
        visited[x][y] = true;
        sum += arr[x][y];
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if(arr[nx][ny] == 0 || visited[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
    public int[] solution(String[] maps) {
        int[] answer;
        
        n = maps.length;
        m = maps[0].length();
        
        arr = new int[n][m];
        visited = new boolean[n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                if(c == 'X') {
                    arr[i][j] = 0;
                }else {
                    arr[i][j] = c - '0';
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0 && !visited[i][j]) {
                    sum = 0;
                    dfs(i, j);
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        
        if(list.size() == 0) {
            answer = new int[]{-1};
        }else {
            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}
