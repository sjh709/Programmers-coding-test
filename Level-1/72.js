function solution(keymap, targets) {
    const arr = targets.map((target) => {
        let sum = 0;
        
        for(let t = 0; t < target.length; t++) {
            let min = 101;
            
            for(let i = 0; i < keymap.length; i++) {
                for(let j = 0; j < keymap[i].length; j++) {
                    if(target[t] === keymap[i][j]) {
                        min = Math.min(min, j + 1);
                        break;
                    }
                }
            }
            
            if(min === 101) return -1;
            
            sum += min;
        }
        
        return sum;
    });
    
    return arr;
}
