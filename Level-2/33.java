import java.util.*;

class File implements Comparable<File> {
    public String head;
    public String number;
    public String tail;
    
    public File(String head, String number, String tail){
        this.head = head;
        this.number = number;
        this.tail = tail;
    }
    
    public int compareTo(File o){
        // head가 같으면 number로 비교(소문자로 통일)
        if(this.head.toLowerCase().equals(o.head.toLowerCase())){
            return Integer.parseInt(this.number) - Integer.parseInt(o.number);
        }else{
            return this.head.toLowerCase().compareTo(o.head.toLowerCase());
        }
    }
}

class Solution {
    public String[] solution(String[] files) {
        File[] fileArr = new File[files.length];
        String[] answer = new String[files.length];
        
        for(int i = 0; i < files.length; i++){
            String head = "";
            String number = "";
            String tail = "";
            int idx = 0;
            for(int j = 0; j < files[i].length(); j++){
                char c = files[i].charAt(j);
                if(idx == 0 && (c >= '0' && c <= '9')){
                    head = files[i].substring(0, j);
                    idx = j;
                }
                if(idx != 0 && !(c >= '0' && c <= '9')){
                    number = files[i].substring(idx, j);
                    idx = j;
                    break;
                }
            }
            if(number.length() == 0){
                number = files[i].substring(idx);
            }else{
                tail = files[i].substring(idx);
            }
            
            fileArr[i] = new File(head, number, tail);
        }
        
        Arrays.sort(fileArr);
            
        for(int i = 0; i < fileArr.length; i++){
            answer[i] = fileArr[i].head + fileArr[i].number + fileArr[i].tail;
        }
        
        return answer;
    }
}
