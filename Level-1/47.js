function solution(absolutes, signs) {
    return absolutes.map((num, idx) => signs[idx] ? num : num * (-1))
                    .reduce((acc, cur) => acc + cur, 0);
}
