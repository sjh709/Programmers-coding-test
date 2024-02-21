function solution(wallpaper) {
    const result = [50, 50, 0, 0];
    
    for(let i = 0; i < wallpaper.length; i++) {
        for(let j = 0; j < wallpaper[i].length; j++) {
            if(wallpaper[i][j] === '#') {
                result[0] = Math.min(result[0], i);
                result[1] = Math.min(result[1], j);
                result[2] = Math.max(result[2], i);
                result[3] = Math.max(result[3], j);
            }
        }
    }
    
    result[2] += 1;
    result[3] += 1;
    
    return result;
}
