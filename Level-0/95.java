class Solution {
    public String[] solution(String my_str, int n) {
        int m = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[m];
        for(int i = 0; i < m; i++){
            answer[i] = "";
        }
        for(int i = 0; i < m; i++){
            for(int j = n * i; j < n * i + n; j++){
                if(j == my_str.length()) break;
                answer[i] += my_str.charAt(j);
            }
        }
        return answer;
    }
}
