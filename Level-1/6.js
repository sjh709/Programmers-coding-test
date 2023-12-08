function solution(a, b) {
    let answer = 0;
    [a, b] = a > b ? [b, a] : [a, b];
    for(let i = a; i <= b; i++) {
        answer += i;
    }
    return answer;
}
