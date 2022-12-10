import java.util.*;

class Solution {
    public HashSet<Integer> numberSet = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        // 숫자 조합 구하기
        recursive("", numbers);
        
        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()) {
            int number = it.next();
            // 소수인지 확인
            if(isPrime(number)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void recursive(String comb, String others) {
        if(!comb.equals("")){
            numberSet.add(Integer.valueOf(comb));
        }
        
        for(int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }
    
    public boolean isPrime(int num) {
        // 0이나 1은 소수가 아님
        if(num == 0 || num == 1) {
            return false;
        }
        
        // 에라토스테네스의 체
        int lim = (int) Math.sqrt(num);
        for(int i = 2; i <= lim; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
