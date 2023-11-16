function solution(quiz) {
    let answer = [];
    quiz.forEach(s => {
        const v = s.split(' ');
        if(v[1] === '+') {
            parseInt(v[0]) + parseInt(v[2]) === parseInt(v[4]) ? answer.push('O') : answer.push('X');
        }else {
            parseInt(v[0]) - parseInt(v[2]) === parseInt(v[4]) ? answer.push('O') : answer.push('X');
        }
    });
    return answer;
}
