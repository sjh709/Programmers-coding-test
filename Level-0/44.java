class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if(j * k == i){
                        if(++cnt == 3){
                            answer++;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
