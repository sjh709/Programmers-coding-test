import java.util.*;

class Node {
    private int x;
    private int y;
    
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < priorities.length; i++) {
            q.offer(new Node(i, priorities[i]));
        }
        
        while(!q.isEmpty()) {
            boolean check = false;
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();
            for(Node n : q) {
                if(y < n.getY()) {
                    check = true;
                    break; 
                }
            }
            if(check) {
                q.offer(new Node(x, y));
            }else {
                list.add(x);
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            if(location == list.get(i)) {
                answer = i + 1;
            }
        }
        
        return answer;
    }
}
