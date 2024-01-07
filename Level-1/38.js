function solution(answers) {
    const a = [1, 2, 3, 4, 5];
    const b = [2, 1, 2, 3, 2, 4, 2, 5];
    const c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let score = [0, 0, 0];
    
    for(let i = 0; i < answers.length; i++) {
        if(answers[i] === a[i % a.length]) score[0]++;
        if(answers[i] === b[i % b.length]) score[1]++;
        if(answers[i] === c[i % c.length]) score[2]++;
    }
    
    const max_score = Math.max(...score);
    let answer = [];
    score.forEach((v, i) => v === max_score ? answer.push(i + 1) : '');
    
    return answer;
}
