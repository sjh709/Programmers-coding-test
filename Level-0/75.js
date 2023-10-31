function solution(order) {
    const answer = String(order).split("").filter(n => n % 3 == 0 && n != 0 ? true : false);
    return answer.length;
}
