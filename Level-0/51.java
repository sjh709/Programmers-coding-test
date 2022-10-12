class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ss = s.split(" ");
        String[] sss = new String[ss.length];
        for(int i = 0; i < ss.length; i++){
            if(ss[i].equals("Z")){
                for(int j = i - 1; j >= 0; j--){
                    if(ss[j].equals("Z") || sss[j].equals("z")) continue;
                    else{
                        sss[i] = "z";
                        sss[j] = "z";
                        break;
                    }
                }
            }else{
                sss[i] = ss[i];
            }
        }
        for(int i = 0; i < sss.length; i++){
            if(sss[i].equals("z")) continue;
            else answer += Integer.parseInt(sss[i]);
        }
        return answer;
    }
}
