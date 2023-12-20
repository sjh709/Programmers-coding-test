function solution(s) {
    let answer = '';
    s.split(' ').forEach(v => {
        for(let i = 0; i < v.length; i++) {
            if(i % 2 === 0) {
                answer += v[i].toUpperCase();
            }else {
                answer += v[i].toLowerCase();
            }
        }
        answer += ' ';
    });
    return answer.substr(0, answer.length - 1);
}
