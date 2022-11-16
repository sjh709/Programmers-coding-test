class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                if(j == 0){
                    answer += String.valueOf(arr[i].charAt(j)).toUpperCase();
                }else{
                    answer += String.valueOf(arr[i].charAt(j)).toLowerCase();
                }
            }
            if(i != arr.length - 1) answer += " ";
        }
        if(s.charAt(s.length() - 1) == ' ') answer += " ";
        return answer;
    }
}
