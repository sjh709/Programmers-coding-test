function solution(my_string) {
    const answer = my_string.split(/\D+/).reduce((acc, cur) => acc + Number(cur), 0);
    return answer;
}
