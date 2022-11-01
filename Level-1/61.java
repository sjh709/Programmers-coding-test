class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int idx = 0;
        for(int i : ingredient){
            stack[idx++] = i;
            if(idx >= 4 && stack[idx - 1] == 1
                        && stack[idx - 2] == 3
                        && stack[idx - 3] == 2
                        && stack[idx - 4] == 1){
                idx -= 4;
                answer += 1;
            }
        }
        
        return answer;
    }
}
