function solution(k, dungeons) {
    const answer = [];
    const visited = Array(dungeons.length).fill(false);
    
    const dfs = (count, k) => {
        answer.push(count);
        
        for(let i = 0; i < dungeons.length; i++) {
            let current = dungeons[i];
            if(k >= current[0] && !visited[i]) {
                visited[i] = 1;
                dfs(count + 1, k - current[1])
                visited[i] = 0;
            }
        }
    }
    
    dfs(0, k);
    
    return Math.max(...answer);
}
