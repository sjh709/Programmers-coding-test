function solution(my_string) {
    const answer = my_string.match(/\d/g).sort().map(n => Number(n));
    return answer;
}
