class Solution {
    public int gcd(int a, int b) {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer;
        
        // 1. 두 분수의 합 계산
        int boonja = numer1 * denom2 + numer2 * denom1;
        int boonmo = denom1 * denom2;
        
        // 2. 최대공약수 계산
        // int start = Math.max(boonja, boonmo);
        // int gcd_value = 1;
        // for(int i = start; i >= 0; i--) {
        //     if(boonmo % i == 0 && boonja % i == 0) {
        //         gcd_value = i;
        //         break;
        //     }
        // }
        int gcd_value = gcd(boonmo, boonja);
        
        // 3. gcd로 나눈 값을 answer에 담기
        answer = new int[]{boonja / gcd_value, boonmo / gcd_value};
        
        return answer;
    }
}
