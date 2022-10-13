class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int limit_x = (board[0] - 1) / 2;
        int limit_y = (board[1] - 1) / 2;
        for(int i = 0; i < keyinput.length; i++){
            int nx = answer[0]; 
            int ny = answer[1];
            switch(keyinput[i]){
                case "up" : ny += 1; break;
                case "down" : ny -= 1; break;
                case "left" : nx -= 1; break;
                case "right" : nx += 1; break;
            }
            if(nx < (-1) * limit_x || ny < (-1) * limit_y || nx > limit_x || ny > limit_y) continue;
            answer[0] = nx;
            answer[1] = ny;
        }
        return answer;
    }
}
