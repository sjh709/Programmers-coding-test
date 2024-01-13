function solution(N, stages) {
    let fail = [];
    
    for(let i = 1; i <= N; i++) {
        let num = stages.filter(v => v === i).length;
        let num2 = stages.filter(v => v >= i).length;
        fail.push([i, num / num2]);
    }
    
    fail.sort((a, b) => b[1] - a[1]);
    
    return fail.map(v => v[0]);
}
