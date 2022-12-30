class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String aeiou = "AEIOU";
        
        // int total = 3905;
        // for(String s : word.split("")) {
        //     total /= 5;
        //     answer += total * aeiou.indexOf(s) + 1;
        // }
        
        int[] arr = {781, 156, 31, 6, 1};
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int n = aeiou.indexOf(c);
            answer += arr[i] * n + 1;
        }
        
        return answer;
    }
}
