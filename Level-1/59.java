class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // // 한 턴의 정의 : a개를 먹고 b개의 새 콜라를 받는다.
        // // 1. 빈 병의 개수 n이 교환 가능한 최소 숫자 a 이상일 때까지 반복
        // while(n >= a) {
        //     // 2. b개의 병 주기
        //     answer += b;
        //     // 3. 남은 병 계산하기
        //     n = n - a + b;
        // }
        
        // 한 턴의 정의 : 현재 가진 콜라를 전부 소진한다.
        // 1. 빈 병의 개수 n이 교환 가능한 최소 숫자 a 이상일 때까지 반복
        while(n >= a) {
            // 2. newCount개의 병 주기
            int newCount = n / a * b;
            answer += newCount;
            // 3. 남은 병 계산하기
            n = n % a + newCount;
        }
        
        return answer;
    }
}
