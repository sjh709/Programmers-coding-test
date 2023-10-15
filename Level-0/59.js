function solution(sides) {
    const a = Math.abs(sides[0] - sides[1]);
    const b = sides[0] + sides[1];
    
    let answer = 0;
    for(let i = a + 1; i < b; i++) {
        answer++;
    }
    
    return answer;
}
