function solution(my_string) {
    let answer = "";
    for(let i of my_string) {
        answer += i === i.toLowerCase() ? i.toUpperCase() : i.toLowerCase();
    }
    return answer;
}
