function solution(n) {
    let answer = 0;
    
    for(let i = 1; i <= n; i++) {
        let cnt = 0;
        for(let j = 1; j <= Math.sqrt(i); j++) {
            if(i % j === 0) {
                if(j === i / j) {
                    cnt += 1;
                }else {
                    cnt += 2;
                }
            }
        }
        
        if(cnt >= 3) answer++;
    }

    return answer;
}
