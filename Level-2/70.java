import java.util.*;

class Solution {
    
    public int[][] arr;
    
    public int bfs(int n, int start) {
        int cnt = 1;
        boolean[] visit = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(start);
        while(!q.isEmpty()) {
            int point = q.poll();
            visit[point] = true;
            for(int i = 1; i <= n; i++) {
                if(visit[i]) continue;
                if(arr[point][i] == 1) {
                    q.offer(i);
                    cnt++;
                }
            }
        }
        
        // cnt - (n - cnt)
        return Math.abs(2 * cnt - n);
    }
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int[n + 1][n + 1];
        
        for(int i = 0; i < wires.length; i++) {
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            
            // 선 끊고
            arr[a][b] = 0;
            arr[b][a] = 0;
            
            answer = Math.min(answer, bfs(n, a));
            
            // 다시 복구
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        
        return answer;
    }
}
