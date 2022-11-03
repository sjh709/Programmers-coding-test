import java.util.*;
class Solution {
    
    public String[] word = {"A", "C", "F", "J", "M", "N", "R", "T"};
    public String[][] con;
    public int[] con_num;
    public boolean[] check = new boolean[8];
    public ArrayList<String> list = new ArrayList<>();
    
    public int solution(int n, String[] data) {
        int answer = 0;
        
        con = new String[data.length][3];
        con_num = new int[data.length];
        
        for(int i = 0; i < data.length; i++){
            String[] temp = data[i].split("");
            
            con[i][0] = temp[0]; // N
            con[i][1] = temp[2]; // F
            con[i][2] = temp[3]; // =
            
            con_num[i] = Integer.parseInt(temp[4]);
        }
        
        dfs(0, new String[8]);
        
        answer = list.size();
        
        return answer;
    }
    
    public void dfs(int num, String[] data){
        if(num == 8){
            boolean value = true;
            
            String temp = String.join("", data);
            
            for(int i = 0; i < con.length; i++){
                int fir = temp.indexOf(con[i][0]);
                int sec = temp.indexOf(con[i][1]);
                
                int mid = Math.abs(sec - fir) - 1;
                
                if(con[i][2].equals("=")){
                    if(mid != con_num[i]){
                        value = false;
                        break;
                    }
                    continue;
                }
                
                if(con[i][2].equals("<")){
                    if(mid >= con_num[i]){
                        value = false;
                        break;
                    }
                    continue;
                }
                
                if(con[i][2].equals(">")){
                    if(mid <= con_num[i]){
                        value = false;
                        break;
                    }
                    continue;
                }
            }
            
            if(value) list.add(temp);
            
            return;
        }
        
        for(int i = 0; i < word.length; i++){
            if(check[i]) continue;
            check[i] = true;
            data[num] = word[i];
            dfs(num + 1, data);
            check[i] = false;
        }
    }
}
