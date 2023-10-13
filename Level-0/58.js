function solution(board) {
    const n = board.length;
    
    const dx = [-1, -1, -1, 0, 0, 1, 1, 1];
    const dy = [-1, 0, 1, -1, 1, -1, 0, 1];
    
    let answer = n * n;
    
    for(let r = 0; r < n; r++) {
        for(let c = 0; c < n; c++) {
            if(board[r][c] === 0) {
                for(let d = 0; d < 8; d++) {
                    let nr = r + dx[d];
                    let nc = c + dy[d];
                    
                    if(nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                    if(board[nr][nc] === 1) {
                        answer--;
                        break;
                    }
                }
            }else {
                answer--;
                continue;
            }
        }
    }
    
    return answer;
}
