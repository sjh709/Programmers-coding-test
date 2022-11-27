import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(char c = 'A'; c <= 'Z'; c++){
            list.add(String.valueOf(c));
        }
        
        int idx = 0;
        while(idx < msg.length()){
            String imsi = "";
            String w = "";
            String c = "";
            while(idx < msg.length()){
                imsi += msg.charAt(idx);
                if(list.contains(imsi)){
                    w = imsi;
                }else{
                    break;
                }
                idx++;
            }
            
            answerList.add(list.indexOf(w) + 1);
            
            if(idx < msg.length()){
                c = String.valueOf(msg.charAt(idx));
                list.add(w + c);
            }
        }
        
        answer = new int[answerList.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
