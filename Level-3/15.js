const getParent = (parent, x) => {
    if(parent[x] === x) return x;
    return getParent(parent, parent[x]);
}

const findParent = (parent, a, b) => {
    const n1 = getParent(parent, a);
    const n2 = getParent(parent, b);
    return n1 === n2 ? true : false;
}

const unionParent = (parent, a, b) => {
    const n1 = getParent(parent, a);
    const n2 = getParent(parent, b);
    return n1 < n2 ? parent[n2] = n1 : parent[n1] = n2;
}

function solution(n, costs) {
    let answer = 0;
    const parent = [];
    
    for(let i = 0; i < n; i++) parent.push(i);
    
    costs.sort((a, b) => a[2] - b[2]);
    
    for(let cost of costs) {
        if(!findParent(parent, cost[0], cost[1])) {
            answer += cost[2];
            unionParent(parent, cost[0], cost[1]);
        }
    }
    
    return answer;
}
