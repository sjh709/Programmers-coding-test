import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] stringNumbers = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(stringNumbers, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        for(String s : stringNumbers) {
            answer += s;
        }
        
        if(stringNumbers[0].equals("0")) {
            answer = "0";
        }
        
        return answer;
    }
}
