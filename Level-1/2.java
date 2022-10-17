class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int num = 0;
        
        for(int i = 1; i < a; i++){
            num += month[i];
        }
        
        num += b;
        answer = day[(num + 4) % 7];
        
        return answer;
    }
}
