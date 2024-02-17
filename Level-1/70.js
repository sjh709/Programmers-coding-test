function solution(s, skip, index) {
    let answer = '';
    
    for(let i = 0; i < s.length; i++) {
        let a = s[i].charCodeAt(0);
        
        for(let j = 0; j < index; j++) {
            a++;
            if(a > 122) a = 97;
            
            while(skip.includes(String.fromCharCode(a))) {
                a++;
                if(a > 122) a = 97;
            }
        }
        
        answer += String.fromCharCode(a);
    }
    
    return answer;
}
