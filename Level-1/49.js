function solution(left, right) {
    let answer = 0;
    
    for(let i = left; i <= right; i++) {
        let set = new Set();
        for(let j = 1; j <= Math.sqrt(i); j++) {
            if(i % j === 0) {
                set.add(j);
                set.add(i / j);
            }
        }
        set.size % 2 === 0 ? answer += i : answer -= i;
    }
    
    return answer;
}
