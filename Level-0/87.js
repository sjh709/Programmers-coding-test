function solution(n, numlist) {
    let answer = [];
    numlist.map(v => v % n === 0 ? answer.push(v) : '');
    return answer;
}
