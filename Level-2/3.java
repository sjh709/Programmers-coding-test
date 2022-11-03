import java.util.*;
class Node{
    private int x;
    private int y;
    
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
}

class Solution {
    
    public int n, m;
    public boolean[][] visited;
    public int[] dx = {0, 0, -1, 1};
    public int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        
        answer = bfs(0, 0, maps);
        
        if(answer == 1) answer = -1;
        
        return answer;
    }
    
    public int bfs(int x, int y, int[][] maps){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        visited[x][y] = true;
        while(!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(visited[nx][ny]) continue;
                if(maps[nx][ny] == 0) continue;
                
                maps[nx][ny] = maps[x][y] + 1;
                q.offer(new Node(nx, ny));
                visited[nx][ny] = true;
            }
        }
        
        return maps[n - 1][m - 1];
    }
}
