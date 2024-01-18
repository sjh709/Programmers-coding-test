function solution(begin, target, words) {
    let cnt = 0;
    let queue = [];
    let visited = [];
    
    if(!words.includes(target)) return 0;
    
    queue.push([begin, cnt]);
    
    while(queue.length) {
        let [v, cnt] = queue.shift();
        
        if(v === target) return cnt;
        
        words.forEach((word) => {
            let notEqule = 0;
            if(visited.includes(word)) return;
            
            for(let i = 0; i < v.length; i++) {
                if(v[i] !== word[i]) notEqule++;
            }
            
            if(notEqule === 1) {
                queue.push([word, ++cnt]);
                visited.push(word);
            }
        });
    }
}
