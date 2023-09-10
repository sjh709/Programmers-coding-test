function solution(my_string, letter) {
    let answer = '';
    for(let i of my_string) {
        if(i !== letter) {
            answer += i;
        }
    }
    return answer;
}
