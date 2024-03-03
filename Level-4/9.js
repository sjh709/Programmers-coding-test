function solution(distance, rocks, n) {
    let answer = 0;
    let min = 1;
    let max = distance;
    rocks.sort((a, b) => a - b);
    
    while(min <= max) {
        const mid = Math.floor((min + max) / 2);
        let remove = 0;
        let prev = 0;
        
        for(let i = 0; i < rocks.length; i++) {
            if(rocks[i] - prev < mid) {
                remove++;
            }else {
                prev = rocks[i];
            }
        }
        if(distance - prev < mid) remove++;
        
        if(remove > n) {
            max = mid - 1;
        }else {
            answer = Math.max(answer, mid);
            min = mid + 1;
        }
    }
    
    return answer;
}
