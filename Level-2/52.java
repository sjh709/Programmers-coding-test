import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<Integer> list;
        String[] idx = new String[skill_trees.length];
        
        for(int i = 0; i < skill_trees.length; i++) {
            list = new ArrayList<Integer>();
            idx[i] = "";
            String s = skill_trees[i];
            for(int k = 0; k < skill.length(); k++) {
                char c1 = skill.charAt(k);
                if(!s.contains(String.valueOf(c1))) {
                    list.add(s.length());
                    continue;
                }
                for(int j = 0; j < s.length(); j++) {
                    char c2 = s.charAt(j);
                    if(c1 == c2) {
                        list.add(j);
                        break;
                    }
                }
            }
            for(int n : list) {
                idx[i] += String.valueOf(n);
            }
        }
        
        boolean check;
        for(int i = 0; i < idx.length; i++) {
            check = true;
            for(int j = 0; j < idx[i].length() - 1; j++) {
                int num1 = idx[i].charAt(j) - '0';
                int num2 = idx[i].charAt(j + 1) - '0';
                if(num1 > num2) {
                    check = false;
                    break;
                }
            }
            if(check) answer++;
        }
        
        return answer;
    }
}
