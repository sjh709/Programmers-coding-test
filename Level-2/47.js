function solution(number, k) {
    const stack = [];
    
    for(let num of number) {
        while(k > 0 && stack[stack.length - 1] < num) {
            stack.pop();
            k--;
        }
        stack.push(num);
    }
    
    stack.splice(stack.length - k, k);
    
    return stack.join('');
}
