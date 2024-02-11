function solution(s) {
    let x = '';
    let cnt1 = 0, cnt2 = 0;
    let answer = 0;
    
    for(let c of s) {
        if(x === '') x = c;
        
        if(x === c) {
            cnt1++;
        }else {
            cnt2++;
        }
        
        if(cnt1 === cnt2) {
            answer++;
            cnt1 = 0, cnt2 = 0;
            x = '';
        }
    }
    
    if(x) answer++;
    
    return answer;
}
