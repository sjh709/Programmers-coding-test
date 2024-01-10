function solution(brown, yellow) {
    for(let i = 1; i <= Math.sqrt(yellow); i++) {
        if(yellow % i === 0) {
            const a = i + 2;
            const b = (yellow / i) + 2;
            if(a * b - yellow === brown) {
                return [b, a];
            }
        }
    }
}
