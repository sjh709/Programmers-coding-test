function solution(n) {
    let pizza = 1;
    while(true) {
        if((pizza * 6) % n === 0) {
            break;
        }
        pizza++;
    }
    return pizza;
}
