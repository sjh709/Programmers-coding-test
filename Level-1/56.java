import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        
        map.put("R", 0); map.put("T", 0);
        map.put("C", 0); map.put("F", 0);
        map.put("J", 0); map.put("M", 0);
        map.put("A", 0); map.put("N", 0);
        
        for(int i = 0; i < survey.length; i++){
            String s = survey[i];
            int c = choices[i];
            if(c >= 1 && c <= 3){
                int n = map.get(String.valueOf(s.charAt(0)));
                n += Math.abs(c - 4);
                map.put(String.valueOf(s.charAt(0)), n);
            }else if(c >= 5 && c <= 7){
                int n = map.get(String.valueOf(s.charAt(1)));
                n += Math.abs(c - 4);
                map.put(String.valueOf(s.charAt(1)), n);
            }
        }
        
        if(map.get("R") < map.get("T")){
            answer += "T";
        }else{
            answer += "R";
        }
        
        if(map.get("C") < map.get("F")){
            answer += "F";
        }else{
            answer += "C";
        }
        
        if(map.get("J") < map.get("M")){
            answer += "M";
        }else{
            answer += "J";
        }
        
        if(map.get("A") < map.get("N")){
            answer += "N";
        }else{
            answer += "A";
        }
        
        return answer;
    }
}
