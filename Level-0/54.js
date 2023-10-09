function solution(keyinput, board) {
    const max = [parseInt(board[0] / 2), parseInt(board[1] / 2)];
    let x = 0, y = 0;
    for(let key of keyinput) {
        if(key === "up") {
            if(y < max[1]) y++;
        }else if(key === "down") {
            if(y > max[1] * -1) y--;
        }else if(key === "left") {
            if(x > max[0] * -1) x--;
        }else if(key === "right") {
            if(x < max[0]) x++;
        }
    }
    return [x, y];
}
