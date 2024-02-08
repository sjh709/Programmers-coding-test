function solution(number, limit, power) {
    const attack = Array.from(new Array(number + 1), () => 0);
    
    for(let i = 1; i <= number; i++) {
        for(let j = 1; j <= Math.sqrt(i); j++) {
            if(i % j === 0) {
                (j === i / j) ? attack[i] += 1 : attack[i] += 2;
            }
        }
        
        if(attack[i] > limit) attack[i] = power;
    }
    
    return attack.reduce((acc, cur) => acc + cur, 0);
}
