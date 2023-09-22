const fact = (num) => (num === 0 ? 1 : fact(num - 1) * num);

function solution(balls, share) {
    const answer = fact(balls) / (fact(balls - share) * fact(share));
    return Math.round(answer);
}
