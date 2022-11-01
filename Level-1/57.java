class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x = new int[10];
        int[] y = new int[10];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < X.length(); i++){
            int temp = X.charAt(i) - '0';
            x[temp]++;
        }
        
        for(int i = 0; i < Y.length(); i++){
            int temp = Y.charAt(i) - '0';
            y[temp]++;
        }
        
        for(int i = 9; i >= 0; i--){
            if(x[i] > 0 && y[i] > 0){
                if(x[i] == y[i]){
                    for(int j = 0; j < x[i]; j++){
                        sb.append(i);
                    }
                }else if(x[i] > y[i]){
                    for(int j = 0; j < y[i]; j++){
                        sb.append(i);
                    }
                }else{
                    for(int j = 0; j < x[i]; j++){
                        sb.append(i);
                    }
                }
            }
        }
        
        answer = sb.toString();
        
        if(answer.length() == 0) answer = "-1";
        if(answer.charAt(0) == '0') answer = "0";
         
        return answer;
    }
}
