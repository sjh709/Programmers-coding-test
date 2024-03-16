function solution(s) {
    const answer = s.split(' ').map(n => +n).sort((a, b) => a - b);
    return answer.filter((n, i) => i === 0 || i === answer.length-1).join(' ');
}
