class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] s = letter.split(" ");
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < mos.length; j++){
                if(s[i].equals(mos[j])) answer += (char)(j + 97);
            }
        }
        return answer;
    }
}
