import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        int[] cnt = new int[id_list.length];
        int[] answer = new int[id_list.length];
        
        for(int i = 0; i < id_list.length; i++){
            list.add(new ArrayList<String>());
        }
        
        for(String s : report){
            String[] arr = s.split(" ");
            for(int i = 0; i < id_list.length; i++){
                if(arr[0].equals(id_list[i])){
                    if(!list.get(i).contains(arr[1])){
                        list.get(i).add(arr[1]);
                    }
                }
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                String name = list.get(i).get(j);
                for(int m = 0; m < id_list.length; m++){
                    if(id_list[m].equals(name)) cnt[m] += 1;
                }
            }
        }
        
        for(int i = 0; i < list.size(); i++){
             for(int j = 0; j < list.get(i).size(); j++){
                 String name = list.get(i).get(j);
                 for(int m = 0; m < cnt.length; m++){
                     if(cnt[m] >= k){
                         if(id_list[m].equals(name)){
                             answer[i] += 1;
                         }
                     }
                 }
             }
        }
        
        return answer;
    }
}
