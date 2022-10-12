class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        
        int a = Math.max(denum, num);
        int b = Math.min(denum, num);
        
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        
        answer[0] = denum / a;
        answer[1] = num / a;
        
        return answer;
    }
}
