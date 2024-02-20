function solution(n, m, section) {
    let painted = 0;
    let answer = 0;
    
    for(let s of section) {
        if(painted < s) {
            answer++;
            painted = s + m - 1;
        }
    }
    
    return answer;
}
