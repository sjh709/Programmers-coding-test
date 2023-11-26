function solution(num, total) {
    let answer = [];
    const value = Math.ceil(total / num);
    const idx = Math.floor(num / 2);
    let first = value - idx;
    for(let i = 0; i < num; i++) {
        answer.push(first++);
    }
    return answer;
}
