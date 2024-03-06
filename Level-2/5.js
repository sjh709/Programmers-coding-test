function solution(board) {
    let answer = 0;
    
    const row = board.length;
    const col = board[0].length;
    
    if(row === 1 || col === 1) return board[0][0];
    
    for(let i = 1; i < row; i++) {
        for(let j = 1; j < col; j++) {
            if(board[i][j] === 1) {
                board[i][j] = Math.min(board[i-1][j], board[i][j-1], board[i-1][j-1]) + 1;
                answer = Math.max(answer, board[i][j]);
            }
        }
    }
    
    return answer * answer;
}
