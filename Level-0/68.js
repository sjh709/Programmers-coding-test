function solution(chicken) {
    let coupon = chicken;
    let answer = 0;
    while(coupon >= 10) {
        chicken = parseInt(coupon / 10);
        coupon = chicken + (coupon % 10);
        answer += chicken;
    }
    return answer;
}
