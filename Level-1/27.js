function solution(x) {
    const n = x.toString().split('').reduce((acc, cur) => acc + parseInt(cur, 10), 0);
    return x % n === 0 ? true : false;
}
