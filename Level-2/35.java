import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length; i++){
            String s = phone_book[i];
            for(int j = i + 1; j < phone_book.length; j++){
                if(s.length() <= phone_book[j].length()){
                    String a = phone_book[j].substring(0, s.length());
                    if(s.equals(a)){
                        answer = false;
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}
