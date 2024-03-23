function solution(arr) {
    let answer = 1;
    
    const gcd = (a, b) => {
        if(b === 0) return a;
        return gcd(b, a % b);
    }
    
    const lcm = (a, b) => {
        return a * b / gcd(a, b);
    }
    
    for(let i = 0; i < arr.length; i++) {
        answer = lcm(answer, arr[i]);
    }
    
    return answer;
}
