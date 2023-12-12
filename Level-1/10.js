function solution(s) {
    let answer = true;
    if(s.length === 4 || s.length === 6) {
        s.split('').forEach(v => isNaN(v) ? answer = false : '');
    }else {
        answer = false;
    }
    return answer;
}
