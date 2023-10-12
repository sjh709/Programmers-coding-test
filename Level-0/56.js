function solution(polynomial) {
    const arr = polynomial.split(" + ");
    const xNum = arr.filter(n => n.includes("x"))
                    .map(n => Number(n.replace("x", "")) || 1)
                    .reduce((acc, cur) => acc + cur, 0);
    const num = arr.filter(n => !isNaN(n))
                   .reduce((acc, cur) => acc + parseInt(cur, 10), 0);
    
    let answer = [];
    if(xNum) answer.push(`${xNum === 1 ? "" : xNum}x`);
    if(num) answer.push(num);
    
    return answer.join(" + ");
}
