function solution(n) {
    let answer = 0;
    for(let i = 1; i <= n; i++) {
        answer++;
        if(answer % 3 === 0 || String(answer).search("3") > -1) i--;
    }
    return answer;
}
