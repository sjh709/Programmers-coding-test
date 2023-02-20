class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] ok = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < ok.length; j++) {
                babbling[i] = babbling[i].replaceAll(ok[j], "A");
            }
        }
        
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("A", "");
            if(babbling[i].length() == 0) answer++;
        }
        
        return answer;
    }
}
