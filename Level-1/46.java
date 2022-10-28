class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계
        for(int i = 0; i < new_id.length(); i++){
            char c = new_id.charAt(i);
            if(c >= '0' && c <= '9') continue;
            if(c >= 'a' && c <= 'z') continue;
            if(c == '-' || c == '_' || c == '.') continue;
            new_id = new_id.replace(c, ' ');
        }
        new_id = new_id.replaceAll(" ", "");
        // 3단계
        while(new_id.contains("..")){
            new_id = new_id.replaceAll("\\.\\.", ".");
        }
        // 4단계
        int len = new_id.length();
        if(len > 1){
            if(new_id.charAt(0) == '.' && new_id.charAt(len - 1) == '.'){
                new_id = new_id.substring(1, len - 1);
            }else if(new_id.charAt(0) == '.' && new_id.charAt(len - 1) != '.'){
                new_id = new_id.substring(1);
            }else if(new_id.charAt(0) != '.' && new_id.charAt(len - 1) == '.'){
                new_id = new_id.substring(0, len - 1);
            }
        }else{
            if(new_id.charAt(0) == '.') new_id = "";
        }
        // 5단계
        if(new_id.length() == 0) new_id += "a";
        // 6단계
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            if(new_id.charAt(new_id.length() - 1) == '.'){
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        // 7단계
        if(new_id.length() <= 2){
            char c = new_id.charAt(new_id.length() - 1);
            while(new_id.length() <= 2){
                new_id += c;
            }
        }
        answer = new_id;
        
        return answer;
    }
}
