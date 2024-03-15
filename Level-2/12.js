const factorial = (num) => {
    let res = 1;
    for(let i = 2; i <= num; i++) {
        res *= i;
    }
    return res;
}

function solution(n, k) {
    const answer = [];
    const arr = Array.from(Array(n), (_, i) => i + 1);
    
    k--;
    while(arr.length) {
        if(k === 0) {
            answer.push(...arr);
            break;
        }
        
        const fact = factorial(arr.length - 1);
        const index = k / fact >> 0;
        k = k % fact;
        
        answer.push(arr[index]);
        arr.splice(index, 1);
    }
    
    return answer;
}
