import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        Arrays.sort(data, (a, b) -> {
            // col번째 컬럼의 값 기준으로 오름차순 정렬
			// col번째 컬럼의 값이 동일하면 첫 번째 컬럼의 값 기준으로 내림차순 정렬
            if(a[col - 1] == b[col - 1]) return b[0] - a[0];
            else return a[col - 1] - b[col - 1];
        });
        
        for(int i = row_begin; i <= row_end; i++) {
            int sum = 0;
            for(int column : data[i - 1]) {
                sum += column % i;
            }
            // XOR
            answer ^= sum;
        }
        
        return answer;
    }
}
