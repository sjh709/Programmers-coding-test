function solution(i, j, k) {
    let answer = 0;
    for(i; i <= j; i++) {
        i.toString().split("").map(n => Number(n) === k ? answer++ : answer);
    }
    return answer;
}
