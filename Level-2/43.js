function solution(brown, yellow) {
    const total = brown + yellow;
    
    for(let h = 3; h <= brown; h++) {
        if(total % h === 0) {
            const w = total / h;
            
            if((w - 2) * (h - 2) === yellow) {
                return [w, h];
            }
        }
    }
}
