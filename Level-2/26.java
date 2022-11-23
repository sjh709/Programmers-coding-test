import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        
        int who = 1;
        int round = 1;
        boolean check = false;
        
        char lastWord = words[0].charAt(0);
        
        for(int i = 0; i < words.length; i++){
            if(who > n){
                who = 1;
                round++;
            }
            
            String word = words[i];
            if(list.contains(word) || word.charAt(0) != lastWord){
                check = true;
                break;
            }else{
                list.add(word);
                who++;
                lastWord = word.charAt(word.length() - 1);
            }
        }
        
        if(check){
            answer = new int[]{who, round};
        }else{
            answer = new int[]{0, 0};
        }

        return answer;
    }
}
