import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer;
        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
        
        String[] ss = s.substring(1, s.length() - 2).split("},");
        
        for(int i = 0; i < ss.length; i++) {
            String[] tmp = ss[i].substring(1).split(",");
            ArrayList<String> arr = new ArrayList<>();
            Collections.addAll(arr, tmp);
            hashMap.put(tmp.length, arr);
        }
        
        Object[] keys = hashMap.keySet().toArray();
        Arrays.sort(keys);
        ArrayList<String> list = new ArrayList<>();

        for(Object o : keys) {
            ArrayList<String> arr = hashMap.get(o);
            for(int i = 0; i < list.size(); i++) {
                arr.remove(list.get(i));
            }
            list.add(arr.get(0));
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }
            
        return answer;
    }
}
