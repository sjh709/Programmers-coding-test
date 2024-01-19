function solution(rectangle, characterX, characterY, itemX, itemY) {
    // 좌표를 2배로 늘린다
    let doubleRec = rectangle.map(rec => rec.map(item => item * 2));
    characterX *= 2;
    characterY *= 2;
    itemX *= 2;
    itemY *= 2;
    
    let dx = [1, -1, 0, 0];
    let dy = [0, 0, 1, -1];
    
    // 시작위치를 큐에 담는다
    let queue = [[characterX, characterY, 0]];
    
    // 최대 50 : 51 * 2 = 102
    let range = Array.from({length : 102}, () => Array(102).fill(0));
    
    // 테두리는 1, 내부는 2
    doubleRec.forEach(([x1, y1, x2, y2]) => {
        for(let i = x1; i <= x2; i++) {
            for(let j = y1; j <= y2; j++) {
                if(i === x1 || i === x2 || j === y1 || j === y2) {
                    if(range[i][j] === 0) range[i][j] = 1;
                }else {
                    range[i][j] = 2;
                }
            }
        }
    });
    
    // 시작위치를 0으로 변경하여 다시 돌아가지 못하게 한다
    range[characterX][characterY] = 0;
    
    while(queue.length) {
        let [x, y, cnt] = queue.shift();
        
        if(x === itemX && y === itemY) return cnt / 2;
        
        for(let i = 0; i < 4; i++) {
            let nx = x + dx[i];
            let ny = y + dy[i];
            
            if(range[nx][ny] === 1) queue.push([nx, ny, cnt + 1]);
            range[nx][ny] = 0;
        }
    }
}
