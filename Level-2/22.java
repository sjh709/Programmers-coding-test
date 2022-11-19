class Solution {
    public int getGCD(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public int getLCM(int a, int b){
        return a * b / getGCD(a, b);
    }
    
    public int solution(int[] arr) {
        int answer = 0;
        
        if(arr.length == 1) answer = arr[0];
        
        int gcd = getGCD(arr[0], arr[1]); // 최대공약수
        int lcm = getLCM(arr[0], arr[1]); // 최소공배수
        
        for(int i = 2; i < arr.length; i++){
            gcd = getGCD(gcd, arr[i]);
            lcm = getLCM(lcm, arr[i]);
        }
        
        answer = lcm;
        
        return answer;
    }
}
