function solution(n) {
    let answer = '';
    const mod = ['4', '1', '2'];
    
    while(n) {
        answer = mod[n % 3] + answer;
        n = n % 3 === 0 ? n / 3 - 1 : Math.floor(n / 3);
    }
    
    return answer;
}
