function solution(num, k) {
    num = String(num);
    return num.indexOf(k) < 0 ? -1 : num.indexOf(k) + 1;
}
