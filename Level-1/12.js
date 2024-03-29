function solution(n) {
    const arr = new Array(n + 1).fill(true);
    let answer = 0;
    
    for(let i = 2; i <= n; i++) {
        if(!arr[i]) continue;
        for(let j = i * 2; j <= n; j += i) {
            arr[j] = false;
        }
    }
    
    for(let i = 2; i <= n; i++) {
        if(arr[i]) answer++;
    }
    
    return answer;
}
