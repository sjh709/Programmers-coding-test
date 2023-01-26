import java.util.*;
class Solution {
    public int bfs(int x, int y, int n) {
        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> visit = new HashMap<>();
        q.offer(x);
        while(!q.isEmpty()) {
            int num = q.poll();
            int cnt = visit.getOrDefault(num, 0);
            if(num == y) return cnt;
            if(num + n <= y && !visit.containsKey(num + n)) {
                q.offer(num + n);
                visit.put(num + n, cnt + 1);
            }
            if(num * 2 <= y && !visit.containsKey(num * 2)) {
                q.offer(num * 2);
                visit.put(num * 2, cnt + 1);
            }
            if(num * 3 <= y && !visit.containsKey(num * 3)) {
                q.offer(num * 3);
                visit.put(num * 3, cnt + 1);
            }
        }
        return -1;
    }
    
    public int solution(int x, int y, int n) {
        int answer = bfs(x, y, n);
        return answer;
    }
}
