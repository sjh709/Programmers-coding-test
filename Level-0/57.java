class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = "";
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9'){
                s += c;
            }else{
                s += " ";
            }
        }
        String[] ss = s.trim().split(" ");
        for(int i = 0; i < ss.length; i++){
            if(ss[i].length() != 0){
                answer += Integer.parseInt(ss[i]);
            }
        }
        return answer;
    }
}
