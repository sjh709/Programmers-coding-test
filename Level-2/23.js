function solution(n) {
    let answer = 0;
    
    while(n !== 0) {
        if(n % 2 === 1) { // 홀
            n -= 1;
            answer++;
        }else { // 짝
            n /= 2;
        }
    }
    
    return answer;
}
