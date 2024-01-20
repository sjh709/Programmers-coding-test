function solution(tickets) {
    const answer = [];
    const visited = [];
    
    tickets.sort();
    
    const len = tickets.length;
    const dfs = (str, count, path) => {
        if(count === len) {
            answer.push([...path, str]);
            return;
        }
        
        for(let i = 0; i < len; i++) {
            if(!visited[i] && tickets[i][0] === str) {
                visited[i] = true;
                dfs(tickets[i][1], count + 1, [...path, str]);
                visited[i] = false;
            }
        }
    };
    
    dfs('ICN', 0, []);
    
    return answer[0];
}
