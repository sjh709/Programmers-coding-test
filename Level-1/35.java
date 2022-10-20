class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String numStr = "";
        int[] score = new int[3];
        int idx = 0;
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(c >= '0' && c <= '9'){
                numStr += String.valueOf(c);
            }else if(c == 'S' || c == 'D' || c == 'T'){
                int n = Integer.parseInt(numStr);
                if(c == 'S'){
                    score[idx++] = (int)Math.pow(n, 1);
                }else if(c == 'D'){
                    score[idx++] = (int)Math.pow(n, 2);
                }else{
                    score[idx++] = (int)Math.pow(n, 3);
                }
                numStr = "";
            }else{
                if(c == '*'){
                    score[idx - 1] *= 2;
                    if(idx - 2 >= 0) score[idx - 2] *= 2;
                }else if(c == '#'){
                    score[idx - 1] *= (-1);
                }
            }
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}
