function solution(sizes) {
    let max = [0, 0];
    
    for(let i = 0; i < sizes.length; i++) {
        sizes[i].sort((a, b) => a - b);
        max[0] = Math.max(max[0], sizes[i][0]);
        max[1] = Math.max(max[1], sizes[i][1]);
    }
    
    return max[0] * max[1];
}
