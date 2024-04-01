function solution(msg) {
    const list = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
    const dir = list.reduce((acc, curr, i) => (acc[curr] = i + 1, acc), {});
    let index = 27;
    let answer = [];
    
    for(let i = 0; i < msg.length; i++) {
        let w = msg[i];
        let c = msg[i + 1];
        
        if(dir[w + c]) {
            while(dir[w + c]) {
                w = w + c;
                c = msg[++i+1];
            }
            dir[w + c] = index++;
            answer.push(dir[w]);
        }else {
            dir[w + c] = index++;
            answer.push(dir[w]);
        }
    }
    
    return answer;
}
