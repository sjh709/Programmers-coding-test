class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String num : s.split(" ")){
            int n = Integer.parseInt(num);
            if(max < n) max = n;
            if(min > n) min = n;
        }
        answer = min + " " + max;
        return answer;
    }
}
