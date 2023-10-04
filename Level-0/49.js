function solution(my_string) {
    let answer = 0;
    my_string.match(/\d/g).map(n => answer += Number(n));
    return answer;
}
