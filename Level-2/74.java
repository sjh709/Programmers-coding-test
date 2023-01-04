class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String bi = "";
        while(n > 0) {
            bi = n % k + bi;
            n /= k;
        }
        
        String[] arr = bi.split("0");
        
        for(String s : arr) {
            if(s.equals("")) continue;
            boolean chk = true;
            long num = Long.parseLong(s);
            if(num < 2) chk = false;
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    chk = false;
                    break;
                }
            }
            if(chk) answer++;
        }
        
        return answer;
    }
}
