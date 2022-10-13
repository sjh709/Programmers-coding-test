class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] s = polynomial.trim().split(" \\+ ");
        int[] num = new int[2];
        for(int i = 0; i < s.length; i++){
            if(s[i].contains("x")){
                if(s[i].length() == 1) s[i] = s[i].replace("x", "1");
                else s[i] = s[i].replace("x", "");
                num[0] += Integer.parseInt(s[i]);
            }else{
                num[1] += Integer.parseInt(s[i]);
            }
        }
        
        if(num[1] == 0){
            if(num[0] == 1) answer = "x";
            else answer = String.valueOf(num[0]) + "x";
        }else if(num[0] == 0){
            answer = String.valueOf(num[1]);
        }else{
            if(num[0] == 1) answer = "x + " + String.valueOf(num[1]);
            else answer = String.valueOf(num[0]) + "x + " + String.valueOf(num[1]);
        }
        
        return answer;
    }
}
