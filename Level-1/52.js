function solution(numbers) {
    let answer = 0;
    let arr = Array.from({length: 10}, (v, i) => i);
    arr.forEach(v => numbers.includes(v) ? '' : answer += v);
    
    return answer;
}
