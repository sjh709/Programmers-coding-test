function solution(array) {
    let answer = 0;
    for(let i = 0; i < array.length; i++) {
        array[i].toString().split('').forEach(v => v === '7' ? answer++ : '');
    }
    return answer;
}
