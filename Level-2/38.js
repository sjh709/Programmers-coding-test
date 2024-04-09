function solution(priorities, location) {
    const idxArr = Array.from({length:priorities.length}, (v, i) => i);
    let answer = 0;
    
    while(priorities.length) {
        const num = priorities.shift();
        const max = Math.max(...priorities);
        const idx = idxArr.shift();
    
        if(num < max) {
            priorities.push(num);
            idxArr.push(idx);
        }else {
            answer++;
            if(idx === location) return answer;
        }
    }
}
