function solution(name) {
    let answer = 0;
    let min_move = name.length - 1;
    
    [...name].map((v, i) => {
        answer += Math.min(v.charCodeAt() - 65, 91 - v.charCodeAt());
        let idx = i + 1;
        
        while(idx < name.length && name[idx] === 'A') {
            idx++;
        }
        
        min_move = Math.min(min_move, 
                            i * 2 + name.length - idx, 
                            i + 2 * (name.length - idx));
    });
    
    return answer + min_move;
}
