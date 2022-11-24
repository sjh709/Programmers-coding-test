import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        ArrayList<String> inter = new ArrayList<>(); // 교집합
        ArrayList<String> union = new ArrayList<>(); // 합집합
        
        for(int i = 0; i < str1.length() - 1; i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i + 1);
            if(first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z'){
                list1.add(first + "" + second);
            }
        }
        
        for(int i = 0; i < str2.length() - 1; i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i + 1);
            if(first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z'){
                list2.add(first + "" + second);
            }
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        for(String s : list1){
            if(list2.remove(s)){
                inter.add(s);
            }
            union.add(s);
        }
        
        for(String s : list2){
            union.add(s);
        }
        
        double jakard = 0;
        
        if(union.size() == 0){
            jakard = 1;
        }else{
            jakard = (double)inter.size() / (double)union.size();
        }
        
        answer = (int)(jakard * 65536);
        
        return answer;
    }
}
