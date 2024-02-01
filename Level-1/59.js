function solution(a, b, n) {
    let answer = 0;
    let re_coke = 0;
    
    while(n >= a) {
        const coke = Math.floor(n / a) * b;
        answer += coke;
        re_coke += n % a;
        n = coke;
        
        if(n < a) {
            if(n + re_coke >= a) {
                n += re_coke;
                re_coke = 0;
            }
        }
    }
    
    return answer;
}
