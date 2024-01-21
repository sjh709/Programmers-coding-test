function solution(game_board, table) {
    let answer = 0;
    let blanks = []; // 빈칸 모양
    let blocks = []; // 블록 모양
    
    // 블록 회전 - y=x축 대칭이동 후 y축(혹은 x축) 대칭이동
    // 회전하면서 기준선에서 떨어질수 있어 rearrange 함수 다시 실행
    const rotate = (list) => {
        let max = Math.max(...list.map(v => Math.max(v[0], v[1])));
        let rotateBlock = list.map(v => [max - v[1], v[0]]);
        return rearrange(rotateBlock);
    };
    
    // 블록 기준점 통일 - 위치 상관없이 모양만 같으면 되기때문에
    const rearrange = (list) => {
        let nx = Math.min(...list.map(v => v[0]));
        let ny = Math.min(...list.map(v => v[1]));
        return list.map(([a, b]) => [a - nx, b - ny]).sort();
    };
    
    const dfs = (board, a, b, find) => {
        const dx = [0, 0, 1, -1];
        const dy = [1, -1, 0, 0];
        
        let stack = [[a, b]];
        let list = [[a, b]];
        board[a][b] = -1;
        
        while(stack.length) {
            let [x, y] = stack.pop();
            for(let i = 0; i < 4; i++) {
                let nx = x + dx[i];
                let ny = y + dy[i];
                
                if(nx < 0 || nx >= board.length || ny < 0 || ny >= board.length) continue;
                
                if(board[nx][ny] === find) {
                    stack.push([nx, ny]);
                    list.push([nx, ny]);
                    board[nx][ny] = -1;
                }
                
            }
        }
        
        return rearrange(list);
    };
    
    for(let i = 0; i < table.length; i++) {
        for(let j = 0; j < table[i].length; j++) {
            if(game_board[i][j] === 0) {
                blanks.push(dfs(game_board, i, j, 0)); // 빈칸 저장
            }
            if(table[i][j] === 1) {
                blocks.push(dfs(table, i, j, 1)); // 블록 저장
            }
        }
    }
    
    blocks.forEach((block) => {
        for(let i = 0; i < blanks.length; i++) {
            let match = false;
            for(let j = 0; j < 4; j++) {
                block = rotate(block);
                if(JSON.stringify(block) === JSON.stringify(blanks[i])) {
                    blanks.splice(i, 1);
                    answer += block.length;
                    match = true;
                    break;
                }
            }
            if(match) break;
        }
    });    
    
    return answer;
}
