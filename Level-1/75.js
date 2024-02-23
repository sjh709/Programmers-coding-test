function solution(park, routes) {
    let [x, y] = [0, 0];
    let [n, m] = [park.length, park[0].length];
    
    for(let i = 0; i < n; i++) {
        for(let j = 0; j < m; j++) {
            if(park[i][j] === 'S') {
                [x, y] = [i, j];
                break;
            }
        }
    }
    
    for(let route of routes) {
        let [nx, ny] = [x, y];
        let [op, nn] = route.split(' ');
        let check = true;
        
        for(let i = 1; i <= nn; i++) {
            switch(op) {
                case 'N' : nx--; break;
                case 'S' : nx++; break;
                case 'W' : ny--; break;
                case 'E' : ny++; break;
            }
            
            if(nx < 0 || nx >= n || ny < 0 || ny >= m) {
                check = false;
                break;
            }
            
            if(park[nx][ny] === 'X') {
                check = false;
                break;
            }
        }
        
        if(check) {
            [x, y] = [nx, ny];
        }
    }
    
    return [x, y];
}
