function solution(ingredient) {
    let stack = [];
    let answer = 0;
    
    for(let i of ingredient) {
        stack.push(i);
        
        if(stack.slice(-4).join('') === '1231') {
            stack.splice(-4);
            answer++;
        }
    }
    
    return answer;
}
