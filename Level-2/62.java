import java.util.*;

class Solution {
    
    public List<String> answerList = new ArrayList<>();
    public Map<String, Integer> hashMap = new HashMap<>();
    
    public void combination(String order, String others, int count) {
        // order : 현재까지 조합된 코스
        // others : 아직까지 사용되지 않은 알파벳
        // count : 몇 개를 더 조합해야 되는지에 대한 count
        
        // 탈출 조건 : count == 0
        if(count == 0) {
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }
        
        // 수행 동작 : 0부터 length까지 조합
        for(int i = 0; i < others.length(); i++) {
            combination(order + others.charAt(i), others.substring(i + 1), count - 1);
        }
    }
    
    public String[] solution(String[] orders, int[] course) {
        // 1. 각 order 정렬
        for(int i = 0; i < orders.length; i++) {
            char[] c = orders[i].toCharArray();
            Arrays.sort(c);
            orders[i] = String.valueOf(c);
        }
        // 2. 각 order를 기준으로 courseLength만큼의 조합 만들기
        for(int courseLength : course) {
            for(String order : orders) {
                combination("", order, courseLength);
            }
            
            // 3. 가장 많은 조합을 answer에 저장한다
            if(!hashMap.isEmpty()) {
                List<Integer> countList = new ArrayList<>(hashMap.values());
                int max = Collections.max(countList);
                
                if(max > 1) {
                    for(String key : hashMap.keySet()) {
                        if(hashMap.get(key) == max) {
                            answerList.add(key);
                        }
                    }
                }
                
                hashMap.clear();
            }
        }
        
        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
