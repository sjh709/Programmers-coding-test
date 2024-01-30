function solution(X, Y) {
    let answer = '';
    X = X.split('');
    Y = Y.split('');
    
    for(let i = 9; i >= 0; i--) {
        const curX = X.filter((v) => Number(v) === i).length;
        const curY = Y.filter((v) => Number(v) === i).length;
        answer += String(i).repeat(Math.min(curX, curY));
    }
    
    if(answer === '') return '-1';
    if(Number(answer) === 0) return '0';
    
    return answer;
}
