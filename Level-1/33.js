function solution(d, budget) {
    d.sort((a, b) => a - b);
    let price = 0;
    
    for(let i = 0; i < d.length; i++) {
        price += d[i];
        if(price > budget) return i;
    }
    
    return d.length;
}
