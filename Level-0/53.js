function solution(dots) {
    let x = [], y = [];
    for(let dot of dots) {
        x.push(dot[0]);
        y.push(dot[1]);
    }
    return (Math.max(...x) - Math.min(...x)) * (Math.max(...y) - Math.min(...y));
}
