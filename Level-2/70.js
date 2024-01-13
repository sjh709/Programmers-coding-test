function solution(n, wires) {
    let answer = Number.MAX_SAFE_INTEGER;
    // 트리만들기
    let tree = Array.from(Array(n + 1), () => []);
    wires.map((element) => {
        let [a, b] = element;
        
        tree[a].push(b);
        tree[b].push(a);
    });
    
    // 제외숫자는 제외하고 탐색 (root노드, 예외노드)
    const searchTree = (root, except) => {
        let count = 0;
        let visit = [];
        let queue = [root];
        visit[root] = true;
        while(queue.length) {
            let index = queue.pop();
            tree[index].forEach((element) => {
                if(element !== except && !visit[element]) {
                    visit[element] = true;
                    queue.push(element);
                }
            });
            count++;
        }
        return count;
    };
    
    // 최솟값을 찾음
    wires.forEach((element) => {
        let [a, b] = element;
        answer = Math.min(answer, Math.abs(searchTree(a, b) - searchTree(b, a)));
    });
    
    return answer;
}
