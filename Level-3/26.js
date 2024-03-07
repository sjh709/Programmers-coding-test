function solution(n, edge) {
    const connects = new Array(n).fill().map(_ => []);
    
    const queue = [0];
    const visited = [1];
    
    for(let e of edge) {
        connects[e[0]-1].push(e[1]-1);
        connects[e[1]-1].push(e[0]-1);
    }
    
    while(queue.length) {
        const cur = queue.shift();
        
        for(let next of connects[cur]) {
            if(!visited[next]) {
                visited[next] = visited[cur] + 1;
                queue.push(next);
            }
        }
    }
    
    const max = Math.max(...visited);
    
    return visited.filter(el => el === max).length;
}
