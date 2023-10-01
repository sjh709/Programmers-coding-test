function solution(n) {
    let answer = 1;
    let idx = 1;
    while(true) {
        answer *= ++idx;
        if(n < answer) break;
    }
    return idx - 1;
}
