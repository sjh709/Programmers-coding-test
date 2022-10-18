class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] ss = s.split(" ", -1);
        for(int i = 0; i < ss.length; i++){
            for(int j = 0; j < ss[i].length(); j++){
                if(j % 2 == 0){
                    answer += (char)(ss[i].charAt(j) - 32);
                }else{
                    answer += ss[i].charAt(j);
                }
            }
            
            if(i != ss.length - 1){
                answer += " ";
            }
        }
        
        return answer;
    }
}
