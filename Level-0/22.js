function solution(num_list) {
    let answer = [];
    let idx = 0;
    for(let i = num_list.length - 1; i >= 0; i--) {
        answer[idx++] = num_list[i];
    }
    return answer;
}
