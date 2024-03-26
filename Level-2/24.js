function solution(n, words) {
    let answer = [0, 0];
    
    for(let i = 0; i < words.length; i++) {
        const word = words[i];
        const p = i % n + 1;
        const turn = Math.ceil((i+1) / n);
        
        if(i > 0) {
            let last = words[i-1].split('').pop();
            
            if(i > words.indexOf(word) || words[i][0] !== last) {
                answer = [p, turn];
                break;
            }
        }
    }
    
    return answer;
}
