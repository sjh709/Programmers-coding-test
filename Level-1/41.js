function solution(board, moves) {
    let answer = 0;
    const arr = [];
    
    moves.forEach((move) => {
        for(let i = 0; i < board.length; i++) {
            const value = board[i][move - 1];
            if(value === 0) continue;
            
            if(arr.length && arr[arr.length - 1] === value) {
                answer += 2;
                arr.pop();
            }else {
                arr.push(value);
            }
            board[i][move - 1] = 0;
            break;
        }
    });
    
    return answer;
}
