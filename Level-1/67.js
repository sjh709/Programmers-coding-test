function solution(s) {
    let answer = [];
    const map = new Map();
    
    for(let i = 0; i < s.length; i++) {
        const c = s[i];
        if(map.has(c)) {
            answer.push(i - map.get(c));
        }else {
            answer.push(-1);
        }
        map.set(c, i);
    }
    
    return answer;
}
