class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] ok = {"aya", "ye", "woo", "ma"};
        String[] no = {"ayaaya", "yeye", "woowoo", "mama"};
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < no.length; j++){
                babbling[i] = babbling[i].replace(no[j], "x");
            }
            
            for(int j = 0; j < ok.length; j++){
                babbling[i] = babbling[i].replace(ok[j], "");
            }
        }
        
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].length() == 0) answer++;
        }
        
        return answer;
    }
}
