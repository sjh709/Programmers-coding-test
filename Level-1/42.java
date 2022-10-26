class Solution {
    public int[] location(int loc){
        int[][] key = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 0, 12}};
        
        int[] result = new int[2];
        
        for(int i = 0; i < key.length; i++){
            for(int j = 0; j < key[i].length; j++){
                if(key[i][j] == loc){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for(int num : numbers){
            if(num == 1 || num == 4 || num == 7){
                left = num;
                answer += "L";
            }else if(num == 3 || num == 6 || num == 9){
                right = num;
                answer += "R";
            }else{
                int[] getNum = location(num);
                int[] getLeft = location(left);
                int[] getRight = location(right);
                
                int l = Math.abs(getLeft[0] - getNum[0]) + Math.abs(getLeft[1] - getNum[1]);
                int r = Math.abs(getRight[0] - getNum[0]) + Math.abs(getRight[1] - getNum[1]);
                
                if(l < r){
                    left = num;
                    answer += "L";
                }else if(l > r){
                    right = num;
                    answer += "R";
                }else{
                    if(hand.equals("left")){
                        left = num;
                        answer += "L";
                    }else if(hand.equals("right")){
                        right = num;
                        answer += "R";
                    }
                }
            }
        }
        return answer;
    }
}
