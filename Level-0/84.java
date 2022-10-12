class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] s = my_string.split(" ");
        boolean bool = false;
        for(int i = 0; i < s.length; i++){
            if(s[i].equals("+")){
                bool = false;
            }else if(s[i].equals("-")){
                bool = true;
            }else{
                int n = Integer.parseInt(s[i]);
                if(bool){
                    answer -= n;
                }else{
                    answer += n;
                }
            }
        }
        return answer;
    }
}
