class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] result = new double[N];
        for(int i = 1; i <= N; i++){
            int n = 0;
            int m = 0;
            for(int j = 0; j < stages.length; j++){
                if(i == stages[j]) n += 1;
                if(i <= stages[j]) m += 1;
            }
            result[i - 1] = (double)n / m;
            answer[i - 1] = i;
        }
        
        for(int i = 0; i < N - 1; i++){
            for(int j = 0; j < N - 1 - i; j++){
                if(result[j] < result[j + 1]){
                    double temp = result[j + 1];
                    result[j + 1] = result[j];
                    result[j] = temp;
                    int temp2 = answer[j + 1];
                    answer[j + 1] = answer[j];
                    answer[j] = temp2;
                }
            }
        }
        
        return answer;
    }
}
