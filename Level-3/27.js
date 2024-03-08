function solution(n, results) {
    let answer = 0;
    const arr = Array.from(Array(n+1), () => Array(n+1).fill(false));
    
    results.forEach(([a, b]) => {
        arr[a][a] = 0;
        arr[b][b] = 0;
        arr[a][b] = 1;
        arr[b][a] = -1;
    });
    
    const range = [...Array(n).keys()].map(e => e + 1);
    
    for(const mid of range) {
        for(const A of range) {
            for(const B of range) {
                if(arr[A][mid] === 1 && arr[mid][B] === 1) {
                    arr[A][B] = 1;
                    arr[B][A] = -1;
                }
            }
        } 
    }
    
    for(let i = 1; i <= n; i++) {
        let cnt = 0;
        for(let j = 1; j <= n; j++) {
            if(arr[i][j] !== false) cnt++;
        }
        if(cnt === n) answer++;
    }
    
    return answer;
}
