class Solution {
    public int[] answer;
    public void combination(int[][] users, int[] emoticons, int[] comb, int depth) {
        int[] discount = {40, 30, 20, 10};
        int[] visit = new int[4];
        
        if(depth == comb.length) {
            int cnt = 0;
            int price = 0;
            for(int i = 0; i < users.length; i++) {
                int a = users[i][0];
                int b = users[i][1];
                int total = 0;
                for(int j = 0; j < comb.length; j++) {
                    if(a <= comb[j]) {
                        total += (int) (emoticons[j] * (100 - comb[j]) / (double) 100);
                    }
                }
                
                if(b <= total) {
                    cnt++;
                }else {
                    price += total;
                }
            }
            
            if(answer[0] < cnt) {
                answer[0] = cnt;
                answer[1] = price;
            }else if(answer[0] == cnt) {
                if(answer[1] < price) {
                    answer[1] = price;
                }
            }
            
            return;
        }
        
        for(int i = 0; i < discount.length; i++) {
            if(visit[i] < 3) {
                visit[i]++;
                comb[depth] = discount[i];
                combination(users, emoticons, comb, depth + 1);
                visit[i]--;
            }
        }
        
    }
    
    public int[] solution(int[][] users, int[] emoticons) {
        answer = new int[2];
        int[] comb = new int[emoticons.length];
        
        combination(users, emoticons, comb, 0);
        
        return answer;
    }
}
