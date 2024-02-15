function solution(t, p) {
    const length = p.length;
    let answer = 0;
    
    for(let i = 0; i <= t.length - length; i++) {
        const num = Number(t.substring(i, i + length));
        if(num <= Number(p)) answer++;
    }
    
    return answer;
}
