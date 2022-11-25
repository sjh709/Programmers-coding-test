import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> cache = new LinkedList<>();
        // cache hit일 경우 실행시간 1
        // cache miss일 경우 실행시간 5
        
        // cacheSize가 0일 경우, cache에 data가 없으니 cache miss가 발생
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        for(int i = 0; i < cities.length; i++){
            String data = cities[i].toLowerCase(); // 소문자로 통일
            // data가 cache에 있다면 cache hit 발생 (cache에 있는 데이터를 갱신)
            if(cache.contains(data)){
                cache.remove(data);
                cache.add(data);
                answer += 1;
            }else{ // data가 cache에 없다면 cache miss 발생
                // cache가 가득 찼다면
                if(cache.size() == cacheSize){
                    cache.remove(); // 가장 오래된 cache data를 삭제
                }
                // cache에 data를 삽입
                cache.add(data);
                answer += 5;
            }
        }
        
        return answer;
    }
}
