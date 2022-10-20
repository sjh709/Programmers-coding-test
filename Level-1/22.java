import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1){
            answer = new int[] {-1};
        }else{
            int temp = Integer.MAX_VALUE;
            ArrayList list = new ArrayList();
            for(int i = 0; i < arr.length; i++){
                list.add(arr[i]);
                if(arr[i] < temp) temp = arr[i];
            }
            list.remove(list.indexOf(temp));
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = (int)list.get(i);
            }
        }
        return answer;
    }
}
