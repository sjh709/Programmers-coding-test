function solution(n, t, m, p) {
    let answer = '';
    let s = '';
    
    for(let i = 0; i < t * m; i++) {
        s += i.toString(n).toUpperCase();
    }
    
    for(let i = p - 1; i < t * m; i += m) {
        answer += s[i];
    }
    
    return answer;
}
