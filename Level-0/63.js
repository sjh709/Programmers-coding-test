function solution(lines) {
    let line = new Array(200).fill(0);
    
    lines.forEach(([a, b]) => {
        for(let i = a; i < b; i++) {
            line[i + 100]++;
        }
    });
    
    return line.reduce((a, c) => c > 1 ? a + 1 : a, 0);
}
